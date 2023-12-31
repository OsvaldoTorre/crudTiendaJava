PGDMP         -                {            tienda_abarrotes    15.3    15.3 %               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                        0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            !           1262    16423    tienda_abarrotes    DATABASE     �   CREATE DATABASE tienda_abarrotes WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Mexico.1252';
     DROP DATABASE tienda_abarrotes;
                postgres    false            "           0    0    DATABASE tienda_abarrotes    ACL     h   GRANT ALL ON DATABASE tienda_abarrotes TO cajerorole;
GRANT ALL ON DATABASE tienda_abarrotes TO pepito;
                   postgres    false    3361            #           0    0    tienda_abarrotes    DATABASE PROPERTIES     6   ALTER DATABASE tienda_abarrotes CONNECTION LIMIT = 2;
                     postgres    false            �            1255    16543    eliminar_producto()    FUNCTION     d  CREATE FUNCTION public.eliminar_producto() RETURNS trigger
    LANGUAGE plpgsql
    AS $$
BEGIN
  -- Inserta el registro eliminado en la tabla 'productos_eliminados'
  INSERT INTO productos_eliminados (id, nombre, descripcion, precio, disponibilidad)
  VALUES (OLD.id, OLD.nombre, OLD.descripcion, OLD.precio, OLD.disponibilidad);

  RETURN NULL;
END;
$$;
 *   DROP FUNCTION public.eliminar_producto();
       public          postgres    false            �            1255    16533    obtener_productos_disponibles()    FUNCTION     �  CREATE FUNCTION public.obtener_productos_disponibles() RETURNS TABLE(id integer, nombre character varying, descripcion text, precio integer, disponibilidad boolean)
    LANGUAGE plpgsql
    AS $$
BEGIN
  RETURN QUERY
  SELECT productos.id, productos.nombre, productos.descripcion, productos.precio, productos.disponibilidad
  FROM productos
  WHERE productos.disponibilidad = true;
END;
$$;
 6   DROP FUNCTION public.obtener_productos_disponibles();
       public          postgres    false            �            1259    16468    detalles_venta    TABLE     �   CREATE TABLE public.detalles_venta (
    id integer NOT NULL,
    producto_id integer,
    cantidad integer NOT NULL,
    precio_unitario numeric(2,0) NOT NULL
);
 "   DROP TABLE public.detalles_venta;
       public         heap    postgres    false            $           0    0    TABLE detalles_venta    ACL     O   GRANT SELECT,INSERT,DELETE,UPDATE ON TABLE public.detalles_venta TO cajerorol;
          public          postgres    false    215            �            1259    16467    detalles_venta_id_seq    SEQUENCE     �   CREATE SEQUENCE public.detalles_venta_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.detalles_venta_id_seq;
       public          postgres    false    215            %           0    0    detalles_venta_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.detalles_venta_id_seq OWNED BY public.detalles_venta.id;
          public          postgres    false    214            �            1259    16506 	   productos    TABLE     �   CREATE TABLE public.productos (
    id integer NOT NULL,
    nombre character varying(100) NOT NULL,
    descripcion text,
    precio integer NOT NULL,
    disponibilidad boolean DEFAULT false
);
    DROP TABLE public.productos;
       public         heap    postgres    false            &           0    0    TABLE productos    ACL     J   GRANT SELECT,INSERT,DELETE,UPDATE ON TABLE public.productos TO cajerorol;
          public          postgres    false    219            �            1259    16534    productos_eliminados    TABLE     �   CREATE TABLE public.productos_eliminados (
    id integer,
    nombre character varying,
    descripcion text,
    precio integer,
    disponibilidad boolean,
    eliminado boolean DEFAULT false
);
 (   DROP TABLE public.productos_eliminados;
       public         heap    postgres    false            �            1259    16505    productos_id_seq    SEQUENCE     �   CREATE SEQUENCE public.productos_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.productos_id_seq;
       public          postgres    false    219            '           0    0    productos_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.productos_id_seq OWNED BY public.productos.id;
          public          postgres    false    218            �            1259    16492    usuarios    TABLE     �   CREATE TABLE public.usuarios (
    id integer NOT NULL,
    usuario character varying(50) NOT NULL,
    email character varying(100) NOT NULL,
    contrasena character varying(100) NOT NULL
);
    DROP TABLE public.usuarios;
       public         heap    postgres    false            (           0    0    TABLE usuarios    ACL     I   GRANT SELECT,INSERT,DELETE,UPDATE ON TABLE public.usuarios TO cajerorol;
          public          postgres    false    217            �            1259    16491    usuarios_id_seq    SEQUENCE     �   CREATE SEQUENCE public.usuarios_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.usuarios_id_seq;
       public          postgres    false    217            )           0    0    usuarios_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.usuarios_id_seq OWNED BY public.usuarios.id;
          public          postgres    false    216            �            1259    16529    vista_productos_detalles    VIEW     �  CREATE VIEW public.vista_productos_detalles AS
 SELECT productos.id,
    productos.nombre,
    productos.descripcion,
    productos.precio,
    productos.disponibilidad,
    detalles_venta.id AS detalle_id,
    detalles_venta.producto_id,
    detalles_venta.cantidad,
    detalles_venta.precio_unitario
   FROM (public.productos
     JOIN public.detalles_venta ON ((productos.id = detalles_venta.producto_id)));
 +   DROP VIEW public.vista_productos_detalles;
       public          postgres    false    215    215    215    219    219    219    219    219    215            y           2604    16471    detalles_venta id    DEFAULT     v   ALTER TABLE ONLY public.detalles_venta ALTER COLUMN id SET DEFAULT nextval('public.detalles_venta_id_seq'::regclass);
 @   ALTER TABLE public.detalles_venta ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    215    214    215            {           2604    16509    productos id    DEFAULT     l   ALTER TABLE ONLY public.productos ALTER COLUMN id SET DEFAULT nextval('public.productos_id_seq'::regclass);
 ;   ALTER TABLE public.productos ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    219    218    219            z           2604    16495    usuarios id    DEFAULT     j   ALTER TABLE ONLY public.usuarios ALTER COLUMN id SET DEFAULT nextval('public.usuarios_id_seq'::regclass);
 :   ALTER TABLE public.usuarios ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    217    216    217                      0    16468    detalles_venta 
   TABLE DATA           T   COPY public.detalles_venta (id, producto_id, cantidad, precio_unitario) FROM stdin;
    public          postgres    false    215   d+                 0    16506 	   productos 
   TABLE DATA           T   COPY public.productos (id, nombre, descripcion, precio, disponibilidad) FROM stdin;
    public          postgres    false    219   �+                 0    16534    productos_eliminados 
   TABLE DATA           j   COPY public.productos_eliminados (id, nombre, descripcion, precio, disponibilidad, eliminado) FROM stdin;
    public          postgres    false    221   ,                 0    16492    usuarios 
   TABLE DATA           B   COPY public.usuarios (id, usuario, email, contrasena) FROM stdin;
    public          postgres    false    217   �,       *           0    0    detalles_venta_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.detalles_venta_id_seq', 12, true);
          public          postgres    false    214            +           0    0    productos_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.productos_id_seq', 12, true);
          public          postgres    false    218            ,           0    0    usuarios_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.usuarios_id_seq', 4, true);
          public          postgres    false    216                       2606    16473 "   detalles_venta detalles_venta_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.detalles_venta
    ADD CONSTRAINT detalles_venta_pkey PRIMARY KEY (id);
 L   ALTER TABLE ONLY public.detalles_venta DROP CONSTRAINT detalles_venta_pkey;
       public            postgres    false    215            �           2606    16514    productos productos_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.productos
    ADD CONSTRAINT productos_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.productos DROP CONSTRAINT productos_pkey;
       public            postgres    false    219            �           2606    16497    usuarios usuarios_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT usuarios_pkey;
       public            postgres    false    217            �           2620    16544 #   productos trigger_eliminar_producto    TRIGGER     �   CREATE TRIGGER trigger_eliminar_producto BEFORE DELETE ON public.productos FOR EACH ROW EXECUTE FUNCTION public.eliminar_producto();
 <   DROP TRIGGER trigger_eliminar_producto ON public.productos;
       public          postgres    false    219    223            �           2606    16519    detalles_venta FK_idP_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalles_venta
    ADD CONSTRAINT "FK_idP_id" FOREIGN KEY (producto_id) REFERENCES public.productos(id) NOT VALID;
 D   ALTER TABLE ONLY public.detalles_venta DROP CONSTRAINT "FK_idP_id";
       public          postgres    false    215    3203    219               M   x�-���0B�0L�8�]��5J��=dAH��O���f"��(91=i\XGm��.�������ޜ�=$o�(         �   x�}�I
�0���)|�b9�=@��n�$�@iB��(=Y:8+��z�E뱞q��S���U�4��,�&������_χn����Ȱ�EW��@�u,�ڃ,�Ttt 9����Sx�Ʃ�,���i�K�H��O���(����
;;$Ʈ`+`�F�����jk�y9(��C��         W   x�34�(�O)M.�W04�tI-N.�,H�<�(O!%5GY�Ќ����ːZ���b�Y�X�X$��H�81�(��72�LJ��qqq ��K�         Y   x�3��/.K�I�7�T�L��Oʯ��tH�M���K��E��2�HM)2�8@Kdu0).cd]�h�����ojc ������ ��4M     
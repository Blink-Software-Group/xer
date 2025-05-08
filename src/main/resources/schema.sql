CREATE TABLE IF NOT EXISTS rol (
    c_id SERIAL PRIMARY KEY,
    d_descripcion TEXT,
    fh_alta TIMESTAMP,
    fh_baja TIMESTAMP
);

CREATE TABLE IF NOT EXISTS estado (
    c_id SERIAL PRIMARY KEY,
    d_descripcion TEXT,
    c_id_estado TEXT,
    fh_alta TIMESTAMP
);

CREATE TABLE IF NOT EXISTS espacio (
    c_id SERIAL PRIMARY KEY,
    d_descripcion TEXT,
    fh_alta TIMESTAMP,
    fh_baja TIMESTAMP,
    fh_actualizacion TIMESTAMP,
    c_codigo TEXT,
    m_activo BOOLEAN
);

CREATE TABLE IF NOT EXISTS usuario (
    c_id SERIAL PRIMARY KEY,
    d_nombre TEXT,
    d_apellido TEXT,
    fh_alta TIMESTAMP,
    fh_baja TIMESTAMP,
    fh_actualizacion TIMESTAMP,
    n_documento TEXT,
    c_id_contacto INTEGER,
    c_id_domicilio INTEGER
    -- FK se agregan después para evitar errores de orden
);

CREATE TABLE IF NOT EXISTS contacto (
    c_id SERIAL PRIMARY KEY,
    c_id_usuario INTEGER,
    d_descripcion TEXT,
    m_tipo_contacto TEXT,
    fh_alta TIMESTAMP,
    fh_actualizacion TIMESTAMP
);

CREATE TABLE IF NOT EXISTS domicilio (
    c_id SERIAL PRIMARY KEY,
    c_id_usuario INTEGER,
    d_calle TEXT,
    d_numero TEXT,
    d_piso TEXT,
    d_dpto TEXT,
    fh_alta TIMESTAMP,
    fh_actualizacion TIMESTAMP,
    d_cod_postal TEXT,
    d_observaciones TEXT,
    m_activo BOOLEAN
);

CREATE TABLE IF NOT EXISTS grupo (
    c_id SERIAL PRIMARY KEY,
    d_id_espacio INTEGER,
    c_id_rol INTEGER,
    c_id_usuario INTEGER,
    fh_alta TIMESTAMP,
    fh_baja TIMESTAMP,
    fh_actualizacion TIMESTAMP,
    m_activo BOOLEAN
);

CREATE TABLE IF NOT EXISTS tarea (
    c_id SERIAL PRIMARY KEY,
    d_descripcion TEXT,
    c_id_estado INTEGER,
    fh_alta TIMESTAMP,
    fh_actualizacion TIMESTAMP
);

CREATE TABLE IF NOT EXISTS nota (
    c_id SERIAL PRIMARY KEY,
    d_descripcion TEXT,
    c_id_turno INTEGER,
    fh_alta TIMESTAMP
);

CREATE TABLE IF NOT EXISTS turno (
    c_id SERIAL PRIMARY KEY,
    c_id_grupo INTEGER,
    fh_entrada TIMESTAMP,
    fh_salida TIMESTAMP,
    fh_actualizacion TIMESTAMP,
    n_monto_hora NUMERIC,
    c_id_tareas INTEGER,
    c_id_notas INTEGER
);

-- Agregar FKs al final (después de que todas las tablas existen)
-- FK para usuario
ALTER TABLE usuario DROP CONSTRAINT IF EXISTS fk_usuario_contacto;
ALTER TABLE usuario DROP CONSTRAINT IF EXISTS fk_usuario_domicilio;
ALTER TABLE usuario
  ADD CONSTRAINT fk_usuario_contacto FOREIGN KEY (c_id_contacto) REFERENCES contacto(c_id),
  ADD CONSTRAINT fk_usuario_domicilio FOREIGN KEY (c_id_domicilio) REFERENCES domicilio(c_id);

-- FK para contacto
ALTER TABLE contacto DROP CONSTRAINT IF EXISTS fk_contacto_usuario;
ALTER TABLE contacto
  ADD CONSTRAINT fk_contacto_usuario FOREIGN KEY (c_id_usuario) REFERENCES usuario(c_id);

-- FK para domicilio
ALTER TABLE domicilio DROP CONSTRAINT IF EXISTS fk_domicilio_usuario;
ALTER TABLE domicilio
  ADD CONSTRAINT fk_domicilio_usuario FOREIGN KEY (c_id_usuario) REFERENCES usuario(c_id);

-- FK para grupo
ALTER TABLE grupo DROP CONSTRAINT IF EXISTS fk_grupo_espacio;
ALTER TABLE grupo DROP CONSTRAINT IF EXISTS fk_grupo_rol;
ALTER TABLE grupo DROP CONSTRAINT IF EXISTS fk_grupo_usuario;
ALTER TABLE grupo
  ADD CONSTRAINT fk_grupo_espacio FOREIGN KEY (d_id_espacio) REFERENCES espacio(c_id),
  ADD CONSTRAINT fk_grupo_rol FOREIGN KEY (c_id_rol) REFERENCES rol(c_id),
  ADD CONSTRAINT fk_grupo_usuario FOREIGN KEY (c_id_usuario) REFERENCES usuario(c_id);

-- FK para tarea
ALTER TABLE tarea DROP CONSTRAINT IF EXISTS fk_tarea_estado;
ALTER TABLE tarea
  ADD CONSTRAINT fk_tarea_estado FOREIGN KEY (c_id_estado) REFERENCES estado(c_id);

-- FK para nota
ALTER TABLE nota DROP CONSTRAINT IF EXISTS fk_nota_turno;
ALTER TABLE nota
  ADD CONSTRAINT fk_nota_turno FOREIGN KEY (c_id_turno) REFERENCES turno(c_id);

-- FK para turno
ALTER TABLE turno DROP CONSTRAINT IF EXISTS fk_turno_grupo;
ALTER TABLE turno
  ADD CONSTRAINT fk_turno_grupo FOREIGN KEY (c_id_grupo) REFERENCES grupo(c_id);


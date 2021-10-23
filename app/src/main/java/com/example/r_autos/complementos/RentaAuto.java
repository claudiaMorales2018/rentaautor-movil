package com.example.r_autos.complementos;

public class RentaAuto {

    private int Empresa_Id;
    private int Inspeccion_ID;
    private int Pedido_Id;
    private int Pedido_Linea;
    private int Empleado_Id;
    private String Inspeccion_Fecha;
    private char  Inspeccion_Tipo;
    private String  Inspeccion_Observacion;
    private char Inspeccion_Estado;
    private String Inspeccion_Resultado;
    private String Inspeccion_01_Luz_Delantera_Alta;
    private String  Inspeccion_02_Luz_Delantera_Baja;
    private String  Inspeccion_03_Luces_Emergencia;
    private String Inspeccion_04_Neblinera;
    private String Inspeccion_05_Direccional_Delantera;
    private String Inspeccion_06_Direccion_Posteriores;
    private String Inspeccion_07_Parabrisas_Delantera;
    private String Inspeccion_08_Parabrisas_Posteriores;
    private String Inspeccion_09_Ventanas;
    private String Inspeccion_10_Espejos_Laterales;
    private String Inspeccion_11_Tapa_Tanque;
    private String Inspeccion_12_Alarme_Retroceso;
    private String Inspeccion_13_Estado_Tablero;
    private String Inspeccion_14_Freno_Mano;
    private String Inspeccion_15_Freno_Servicios;
    private String Inspeccion_16_Cinturon_Seguridad_Chofer;
    private String Inspeccion_17_Cinturon_Pasajeros;
    private String Inspeccion_18_Orden_Limpieza;
    private String Inspeccion_19_Bocinas;
    private String Inspeccion_20_Asientos;
    private String Inspeccion_21_Llantas_Delantera_Derecha;
    private String Inspeccion_22_Llanta_Delantera_Izquierda;
    private String Inspeccion_23_Llanta_Posterior_Derecha;
    private String Inspeccion_24_Llanta_Posterior_Izquierda;
    private String Inspeccion_25_Llanta_Repuesto;
    private String Inspeccion_26_Conos_Seguridad;
    private String Inspeccion_27_Extintor;
    private String Inspeccion_28_Tricket;
    private String Inspeccion_29_Rallon_Delantero;
    private String Inspeccion_30_Rallon_Trasero;
    private String Inspeccion_31_Rallon_Lateral_Derecho;
    private String Inspeccion_32_Rallon_Lateral_Izquierdo;
    private String Inspeccion_33_Tarjeta_Propiedad;
    private String Inspeccion_34_Tanque_Lleno;
    private String Inspeccion_35_Llaves;

    public RentaAuto() {
    }

    public RentaAuto(int empresa_Id, int inspeccion_ID, int pedido_Id, int pedido_Linea, int empleado_Id, String inspeccion_Fecha, char inspeccion_Tipo, String inspeccion_Observacion, char inspeccion_Estado, String inspeccion_Resultado, String inspeccion_01_Luz_Delantera_Alta, String inspeccion_02_Luz_Delantera_Baja, String inspeccion_03_Luces_Emergencia, String inspeccion_04_Neblinera, String inspeccion_05_Direccional_Delantera, String inspeccion_06_Direccion_Posteriores, String inspeccion_07_Parabrisas_Delantera, String inspeccion_08_Parabrisas_Posteriores, String inspeccion_09_Ventanas, String inspeccion_10_Espejos_Laterales, String inspeccion_11_Tapa_Tanque, String inspeccion_12_Alarme_Retroceso, String inspeccion_13_Estado_Tablero, String inspeccion_14_Freno_Mano, String inspeccion_15_Freno_Servicios, String inspeccion_16_Cinturon_Seguridad_Chofer, String inspeccion_17_Cinturon_Pasajeros, String inspeccion_18_Orden_Limpieza, String inspeccion_19_Bocinas, String inspeccion_20_Asientos, String inspeccion_21_Llantas_Delantera_Derecha, String inspeccion_22_Llanta_Delantera_Izquierda, String inspeccion_23_Llanta_Posterior_Derecha, String inspeccion_24_Llanta_Posterior_Izquierda, String inspeccion_25_Llanta_Repuesto, String inspeccion_26_Conos_Seguridad, String inspeccion_27_Extintor, String inspeccion_28_Tricket, String inspeccion_29_Rallon_Delantero, String inspeccion_30_Rallon_Trasero, String inspeccion_31_Rallon_Lateral_Derecho, String inspeccion_32_Rallon_Lateral_Izquierdo, String inspeccion_33_Tarjeta_Propiedad, String inspeccion_34_Tanque_Lleno, String inspeccion_35_Llaves) {
        Empresa_Id = empresa_Id;
        Inspeccion_ID = inspeccion_ID;
        Pedido_Id = pedido_Id;
        Pedido_Linea = pedido_Linea;
        Empleado_Id = empleado_Id;
        Inspeccion_Fecha = inspeccion_Fecha;
        Inspeccion_Tipo = inspeccion_Tipo;
        Inspeccion_Observacion = inspeccion_Observacion;
        Inspeccion_Estado = inspeccion_Estado;
        Inspeccion_Resultado = inspeccion_Resultado;
        Inspeccion_01_Luz_Delantera_Alta = inspeccion_01_Luz_Delantera_Alta;
        Inspeccion_02_Luz_Delantera_Baja = inspeccion_02_Luz_Delantera_Baja;
        Inspeccion_03_Luces_Emergencia = inspeccion_03_Luces_Emergencia;
        Inspeccion_04_Neblinera = inspeccion_04_Neblinera;
        Inspeccion_05_Direccional_Delantera = inspeccion_05_Direccional_Delantera;
        Inspeccion_06_Direccion_Posteriores = inspeccion_06_Direccion_Posteriores;
        Inspeccion_07_Parabrisas_Delantera = inspeccion_07_Parabrisas_Delantera;
        Inspeccion_08_Parabrisas_Posteriores = inspeccion_08_Parabrisas_Posteriores;
        Inspeccion_09_Ventanas = inspeccion_09_Ventanas;
        Inspeccion_10_Espejos_Laterales = inspeccion_10_Espejos_Laterales;
        Inspeccion_11_Tapa_Tanque = inspeccion_11_Tapa_Tanque;
        Inspeccion_12_Alarme_Retroceso = inspeccion_12_Alarme_Retroceso;
        Inspeccion_13_Estado_Tablero = inspeccion_13_Estado_Tablero;
        Inspeccion_14_Freno_Mano = inspeccion_14_Freno_Mano;
        Inspeccion_15_Freno_Servicios = inspeccion_15_Freno_Servicios;
        Inspeccion_16_Cinturon_Seguridad_Chofer = inspeccion_16_Cinturon_Seguridad_Chofer;
        Inspeccion_17_Cinturon_Pasajeros = inspeccion_17_Cinturon_Pasajeros;
        Inspeccion_18_Orden_Limpieza = inspeccion_18_Orden_Limpieza;
        Inspeccion_19_Bocinas = inspeccion_19_Bocinas;
        Inspeccion_20_Asientos = inspeccion_20_Asientos;
        Inspeccion_21_Llantas_Delantera_Derecha = inspeccion_21_Llantas_Delantera_Derecha;
        Inspeccion_22_Llanta_Delantera_Izquierda = inspeccion_22_Llanta_Delantera_Izquierda;
        Inspeccion_23_Llanta_Posterior_Derecha = inspeccion_23_Llanta_Posterior_Derecha;
        Inspeccion_24_Llanta_Posterior_Izquierda = inspeccion_24_Llanta_Posterior_Izquierda;
        Inspeccion_25_Llanta_Repuesto = inspeccion_25_Llanta_Repuesto;
        Inspeccion_26_Conos_Seguridad = inspeccion_26_Conos_Seguridad;
        Inspeccion_27_Extintor = inspeccion_27_Extintor;
        Inspeccion_28_Tricket = inspeccion_28_Tricket;
        Inspeccion_29_Rallon_Delantero = inspeccion_29_Rallon_Delantero;
        Inspeccion_30_Rallon_Trasero = inspeccion_30_Rallon_Trasero;
        Inspeccion_31_Rallon_Lateral_Derecho = inspeccion_31_Rallon_Lateral_Derecho;
        Inspeccion_32_Rallon_Lateral_Izquierdo = inspeccion_32_Rallon_Lateral_Izquierdo;
        Inspeccion_33_Tarjeta_Propiedad = inspeccion_33_Tarjeta_Propiedad;
        Inspeccion_34_Tanque_Lleno = inspeccion_34_Tanque_Lleno;
        Inspeccion_35_Llaves = inspeccion_35_Llaves;
    }

    public int getEmpresa_Id() {
        return Empresa_Id;
    }

    public void setEmpresa_Id(int empresa_Id) {
        Empresa_Id = empresa_Id;
    }

    public int getInspeccion_ID() {
        return Inspeccion_ID;
    }

    public void setInspeccion_ID(int inspeccion_ID) {
        Inspeccion_ID = inspeccion_ID;
    }

    public int getPedido_Id() {
        return Pedido_Id;
    }

    public void setPedido_Id(int pedido_Id) {
        Pedido_Id = pedido_Id;
    }

    public int getPedido_Linea() {
        return Pedido_Linea;
    }

    public void setPedido_Linea(int pedido_Linea) {
        Pedido_Linea = pedido_Linea;
    }

    public int getEmpleado_Id() {
        return Empleado_Id;
    }

    public void setEmpleado_Id(int empleado_Id) {
        Empleado_Id = empleado_Id;
    }

    public String getInspeccion_Fecha() {
        return Inspeccion_Fecha;
    }

    public void setInspeccion_Fecha(String inspeccion_Fecha) {
        Inspeccion_Fecha = inspeccion_Fecha;
    }

    public char getInspeccion_Tipo() {
        return Inspeccion_Tipo;
    }

    public void setInspeccion_Tipo(char inspeccion_Tipo) {
        Inspeccion_Tipo = inspeccion_Tipo;
    }

    public String getInspeccion_Observacion() {
        return Inspeccion_Observacion;
    }

    public void setInspeccion_Observacion(String inspeccion_Observacion) {
        Inspeccion_Observacion = inspeccion_Observacion;
    }

    public char getInspeccion_Estado() {
        return Inspeccion_Estado;
    }

    public void setInspeccion_Estado(char inspeccion_Estado) {
        Inspeccion_Estado = inspeccion_Estado;
    }

    public String getInspeccion_Resultado() {
        return Inspeccion_Resultado;
    }

    public void setInspeccion_Resultado(String inspeccion_Resultado) {
        Inspeccion_Resultado = inspeccion_Resultado;
    }

    public String getInspeccion_01_Luz_Delantera_Alta() {
        return Inspeccion_01_Luz_Delantera_Alta;
    }

    public void setInspeccion_01_Luz_Delantera_Alta(String inspeccion_01_Luz_Delantera_Alta) {
        Inspeccion_01_Luz_Delantera_Alta = inspeccion_01_Luz_Delantera_Alta;
    }

    public String getInspeccion_02_Luz_Delantera_Baja() {
        return Inspeccion_02_Luz_Delantera_Baja;
    }

    public void setInspeccion_02_Luz_Delantera_Baja(String inspeccion_02_Luz_Delantera_Baja) {
        Inspeccion_02_Luz_Delantera_Baja = inspeccion_02_Luz_Delantera_Baja;
    }

    public String getInspeccion_03_Luces_Emergencia() {
        return Inspeccion_03_Luces_Emergencia;
    }

    public void setInspeccion_03_Luces_Emergencia(String inspeccion_03_Luces_Emergencia) {
        Inspeccion_03_Luces_Emergencia = inspeccion_03_Luces_Emergencia;
    }

    public String getInspeccion_04_Neblinera() {
        return Inspeccion_04_Neblinera;
    }

    public void setInspeccion_04_Neblinera(String inspeccion_04_Neblinera) {
        Inspeccion_04_Neblinera = inspeccion_04_Neblinera;
    }

    public String getInspeccion_05_Direccional_Delantera() {
        return Inspeccion_05_Direccional_Delantera;
    }

    public void setInspeccion_05_Direccional_Delantera(String inspeccion_05_Direccional_Delantera) {
        Inspeccion_05_Direccional_Delantera = inspeccion_05_Direccional_Delantera;
    }

    public String getInspeccion_06_Direccion_Posteriores() {
        return Inspeccion_06_Direccion_Posteriores;
    }

    public void setInspeccion_06_Direccion_Posteriores(String inspeccion_06_Direccion_Posteriores) {
        Inspeccion_06_Direccion_Posteriores = inspeccion_06_Direccion_Posteriores;
    }

    public String getInspeccion_07_Parabrisas_Delantera() {
        return Inspeccion_07_Parabrisas_Delantera;
    }

    public void setInspeccion_07_Parabrisas_Delantera(String inspeccion_07_Parabrisas_Delantera) {
        Inspeccion_07_Parabrisas_Delantera = inspeccion_07_Parabrisas_Delantera;
    }

    public String getInspeccion_08_Parabrisas_Posteriores() {
        return Inspeccion_08_Parabrisas_Posteriores;
    }

    public void setInspeccion_08_Parabrisas_Posteriores(String inspeccion_08_Parabrisas_Posteriores) {
        Inspeccion_08_Parabrisas_Posteriores = inspeccion_08_Parabrisas_Posteriores;
    }

    public String getInspeccion_09_Ventanas() {
        return Inspeccion_09_Ventanas;
    }

    public void setInspeccion_09_Ventanas(String inspeccion_09_Ventanas) {
        Inspeccion_09_Ventanas = inspeccion_09_Ventanas;
    }

    public String getInspeccion_10_Espejos_Laterales() {
        return Inspeccion_10_Espejos_Laterales;
    }

    public void setInspeccion_10_Espejos_Laterales(String inspeccion_10_Espejos_Laterales) {
        Inspeccion_10_Espejos_Laterales = inspeccion_10_Espejos_Laterales;
    }

    public String getInspeccion_11_Tapa_Tanque() {
        return Inspeccion_11_Tapa_Tanque;
    }

    public void setInspeccion_11_Tapa_Tanque(String inspeccion_11_Tapa_Tanque) {
        Inspeccion_11_Tapa_Tanque = inspeccion_11_Tapa_Tanque;
    }

    public String getInspeccion_12_Alarme_Retroceso() {
        return Inspeccion_12_Alarme_Retroceso;
    }

    public void setInspeccion_12_Alarme_Retroceso(String inspeccion_12_Alarme_Retroceso) {
        Inspeccion_12_Alarme_Retroceso = inspeccion_12_Alarme_Retroceso;
    }

    public String getInspeccion_13_Estado_Tablero() {
        return Inspeccion_13_Estado_Tablero;
    }

    public void setInspeccion_13_Estado_Tablero(String inspeccion_13_Estado_Tablero) {
        Inspeccion_13_Estado_Tablero = inspeccion_13_Estado_Tablero;
    }

    public String getInspeccion_14_Freno_Mano() {
        return Inspeccion_14_Freno_Mano;
    }

    public void setInspeccion_14_Freno_Mano(String inspeccion_14_Freno_Mano) {
        Inspeccion_14_Freno_Mano = inspeccion_14_Freno_Mano;
    }

    public String getInspeccion_15_Freno_Servicios() {
        return Inspeccion_15_Freno_Servicios;
    }

    public void setInspeccion_15_Freno_Servicios(String inspeccion_15_Freno_Servicios) {
        Inspeccion_15_Freno_Servicios = inspeccion_15_Freno_Servicios;
    }

    public String getInspeccion_16_Cinturon_Seguridad_Chofer() {
        return Inspeccion_16_Cinturon_Seguridad_Chofer;
    }

    public void setInspeccion_16_Cinturon_Seguridad_Chofer(String inspeccion_16_Cinturon_Seguridad_Chofer) {
        Inspeccion_16_Cinturon_Seguridad_Chofer = inspeccion_16_Cinturon_Seguridad_Chofer;
    }

    public String getInspeccion_17_Cinturon_Pasajeros() {
        return Inspeccion_17_Cinturon_Pasajeros;
    }

    public void setInspeccion_17_Cinturon_Pasajeros(String inspeccion_17_Cinturon_Pasajeros) {
        Inspeccion_17_Cinturon_Pasajeros = inspeccion_17_Cinturon_Pasajeros;
    }

    public String getInspeccion_18_Orden_Limpieza() {
        return Inspeccion_18_Orden_Limpieza;
    }

    public void setInspeccion_18_Orden_Limpieza(String inspeccion_18_Orden_Limpieza) {
        Inspeccion_18_Orden_Limpieza = inspeccion_18_Orden_Limpieza;
    }

    public String getInspeccion_19_Bocinas() {
        return Inspeccion_19_Bocinas;
    }

    public void setInspeccion_19_Bocinas(String inspeccion_19_Bocinas) {
        Inspeccion_19_Bocinas = inspeccion_19_Bocinas;
    }

    public String getInspeccion_20_Asientos() {
        return Inspeccion_20_Asientos;
    }

    public void setInspeccion_20_Asientos(String inspeccion_20_Asientos) {
        Inspeccion_20_Asientos = inspeccion_20_Asientos;
    }

    public String getInspeccion_21_Llantas_Delantera_Derecha() {
        return Inspeccion_21_Llantas_Delantera_Derecha;
    }

    public void setInspeccion_21_Llantas_Delantera_Derecha(String inspeccion_21_Llantas_Delantera_Derecha) {
        Inspeccion_21_Llantas_Delantera_Derecha = inspeccion_21_Llantas_Delantera_Derecha;
    }

    public String getInspeccion_22_Llanta_Delantera_Izquierda() {
        return Inspeccion_22_Llanta_Delantera_Izquierda;
    }

    public void setInspeccion_22_Llanta_Delantera_Izquierda(String inspeccion_22_Llanta_Delantera_Izquierda) {
        Inspeccion_22_Llanta_Delantera_Izquierda = inspeccion_22_Llanta_Delantera_Izquierda;
    }

    public String getInspeccion_23_Llanta_Posterior_Derecha() {
        return Inspeccion_23_Llanta_Posterior_Derecha;
    }

    public void setInspeccion_23_Llanta_Posterior_Derecha(String inspeccion_23_Llanta_Posterior_Derecha) {
        Inspeccion_23_Llanta_Posterior_Derecha = inspeccion_23_Llanta_Posterior_Derecha;
    }

    public String getInspeccion_24_Llanta_Posterior_Izquierda() {
        return Inspeccion_24_Llanta_Posterior_Izquierda;
    }

    public void setInspeccion_24_Llanta_Posterior_Izquierda(String inspeccion_24_Llanta_Posterior_Izquierda) {
        Inspeccion_24_Llanta_Posterior_Izquierda = inspeccion_24_Llanta_Posterior_Izquierda;
    }

    public String getInspeccion_25_Llanta_Repuesto() {
        return Inspeccion_25_Llanta_Repuesto;
    }

    public void setInspeccion_25_Llanta_Repuesto(String inspeccion_25_Llanta_Repuesto) {
        Inspeccion_25_Llanta_Repuesto = inspeccion_25_Llanta_Repuesto;
    }

    public String getInspeccion_26_Conos_Seguridad() {
        return Inspeccion_26_Conos_Seguridad;
    }

    public void setInspeccion_26_Conos_Seguridad(String inspeccion_26_Conos_Seguridad) {
        Inspeccion_26_Conos_Seguridad = inspeccion_26_Conos_Seguridad;
    }

    public String getInspeccion_27_Extintor() {
        return Inspeccion_27_Extintor;
    }

    public void setInspeccion_27_Extintor(String inspeccion_27_Extintor) {
        Inspeccion_27_Extintor = inspeccion_27_Extintor;
    }

    public String getInspeccion_28_Tricket() {
        return Inspeccion_28_Tricket;
    }

    public void setInspeccion_28_Tricket(String inspeccion_28_Tricket) {
        Inspeccion_28_Tricket = inspeccion_28_Tricket;
    }

    public String getInspeccion_29_Rallon_Delantero() {
        return Inspeccion_29_Rallon_Delantero;
    }

    public void setInspeccion_29_Rallon_Delantero(String inspeccion_29_Rallon_Delantero) {
        Inspeccion_29_Rallon_Delantero = inspeccion_29_Rallon_Delantero;
    }

    public String getInspeccion_30_Rallon_Trasero() {
        return Inspeccion_30_Rallon_Trasero;
    }

    public void setInspeccion_30_Rallon_Trasero(String inspeccion_30_Rallon_Trasero) {
        Inspeccion_30_Rallon_Trasero = inspeccion_30_Rallon_Trasero;
    }

    public String getInspeccion_31_Rallon_Lateral_Derecho() {
        return Inspeccion_31_Rallon_Lateral_Derecho;
    }

    public void setInspeccion_31_Rallon_Lateral_Derecho(String inspeccion_31_Rallon_Lateral_Derecho) {
        Inspeccion_31_Rallon_Lateral_Derecho = inspeccion_31_Rallon_Lateral_Derecho;
    }

    public String getInspeccion_32_Rallon_Lateral_Izquierdo() {
        return Inspeccion_32_Rallon_Lateral_Izquierdo;
    }

    public void setInspeccion_32_Rallon_Lateral_Izquierdo(String inspeccion_32_Rallon_Lateral_Izquierdo) {
        Inspeccion_32_Rallon_Lateral_Izquierdo = inspeccion_32_Rallon_Lateral_Izquierdo;
    }

    public String getInspeccion_33_Tarjeta_Propiedad() {
        return Inspeccion_33_Tarjeta_Propiedad;
    }

    public void setInspeccion_33_Tarjeta_Propiedad(String inspeccion_33_Tarjeta_Propiedad) {
        Inspeccion_33_Tarjeta_Propiedad = inspeccion_33_Tarjeta_Propiedad;
    }

    public String getInspeccion_34_Tanque_Lleno() {
        return Inspeccion_34_Tanque_Lleno;
    }

    public void setInspeccion_34_Tanque_Lleno(String inspeccion_34_Tanque_Lleno) {
        Inspeccion_34_Tanque_Lleno = inspeccion_34_Tanque_Lleno;
    }

    public String getInspeccion_35_Llaves() {
        return Inspeccion_35_Llaves;
    }

    public void setInspeccion_35_Llaves(String inspeccion_35_Llaves) {
        Inspeccion_35_Llaves = inspeccion_35_Llaves;
    }

}



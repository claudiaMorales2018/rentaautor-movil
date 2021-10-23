package com.example.r_autos.complementos;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.r_autos.MainActivityInsertar;

public class Metodos {
    //Declarar una constante de la IP del servidor local en mi Red LAN
    public static final String IP_SERVER = "http://192.168.0.1";


    //Implementar variables para la conexion y obtencion de informacion
    Context context;
    RequestQueue requestQueue;
    JsonObjectRequest jsonObjectRequest;

    public Metodos() {
    }

    //Metodo de Insertar
    public void Insertar(Context context,
                         int Empresa_Id,
                         int Inspeccion_Id,
                         int Pedido_Id,
                         int Pedido_Linea,
                         int Empleado_Id,
                         String Inspeccion_Fecha,
                         String Inspeccion_Tipo,
                         String Inspeccion_Observacion,
                         String Inspeccion_Estado,
                         String Inspeccion_Resultado,
                         String Inspeccion_01_Luz_Delantera_Alta,
                         String Inspeccion_02_Luz_Delantera_Baja,
                         String Inspeccion_03_Luces_Emergencia,
                         String Inspeccion_04_Neblinera,
                         String Inspeccion_05_Direccional_Delantera,
                         String Inspeccion_06_Direccion_Posteriores,
                         String Inspeccion_07_Parabrisas_Delantera,
                         String Inspeccion_08_Parabrisas_Posteriores,
                         String Inspeccion_09_Ventanas,
                         String Inspeccion_10_Espejos_Laterales,
                         String Inspeccion_11_Tapa_Tanque,
                         String Inspeccion_12_Alarme_Retroceso,
                         String Inspeccion_13_Estado_Tablero,
                         String Inspeccion_14_Freno_Mano,
                         String Inspeccion_15_Freno_Servicios,
                         String Inspeccion_16_Cinturon_Seguridad_Chofer,
                         String Inspeccion_17_Cinturon_Pasajeros,
                         String Inspeccion_18_Orden_Limpieza,
                         String Inspeccion_19_Bocinas,
                         String Inspeccion_20_Asientos,
                         String Inspeccion_21_Llantas_Delantera_Derecha,
                         String Inspeccion_22_Llanta_Delantera_Izquierda,
                         String Inspeccion_23_Llanta_Posterior_Derecha,
                         String Inspeccion_24_Llanta_Posterior_Izquierda,
                         String Inspeccion_25_Llanta_Repuesto,
                         String Inspeccion_26_Conos_Seguridad,
                         String Inspeccion_27_Extintor,
                         String Inspeccion_28_Tricket,
                         String Inspeccion_29_Rallon_Delantero,
                         String Inspeccion_30_Rallon_Trasero,
                         String Inspeccion_31_Rallon_Lateral_Derecho,
                         String Inspeccion_32_Rallon_Lateral_Izquierdo,
                         String Inspeccion_33_Tarjeta_Propiedad,
                         String Inspeccion_34_Tanque_Lleno,
                         String Inspeccion_35_Llaves,
                         Response.Listener listener, Response.ErrorListener errorListener) {
        this.context = context;
        try {
            String url;
            url = IP_SERVER + "CheckListRautos/insertar_sw.php?&Empresa_Id=" + Empresa_Id +
                    "&Inspeccion_Id=" + Inspeccion_Id +
                    "&Pedido_Id=" + Pedido_Id + "&Pedido_Linea=" + Pedido_Linea +
                    "&Empleado_Id=" + Empleado_Id + "&Inspeccion_Fecha=" + Inspeccion_Fecha +
                    "&Inspeccion_Tipo=" + Inspeccion_Tipo + "&Pedido_Linea=" + Pedido_Linea +
                    "&Inspeccion_Observacion=" + Inspeccion_Observacion + "&Inspeccion_Estado="+Inspeccion_Estado+"&Inspeccion_Resultado=" + Inspeccion_Resultado +
                    "&Inspeccion_01_Luz_Delantera_Alta=" + Inspeccion_01_Luz_Delantera_Alta + "&Inspeccion_02_Luz_Delantera_Baja=" + Inspeccion_02_Luz_Delantera_Baja +
                    "&Inspeccion_03_Luces_Emergencia=" + Inspeccion_03_Luces_Emergencia + "&Inspeccion_04_Neblinera=" + Inspeccion_04_Neblinera +
                    "&Inspeccion_05_Direccional_Delantera=" + Inspeccion_05_Direccional_Delantera + "&Inspeccion_06_Direccion_Posteriores=" + Inspeccion_06_Direccion_Posteriores +
                    "&Inspeccion_07_Parabrisas_Delantera=" + Inspeccion_07_Parabrisas_Delantera + "&Inspeccion_08_Parabrisas_Posteriores=" + Inspeccion_08_Parabrisas_Posteriores +
                    "&Inspeccion_09_Ventanas=" + Inspeccion_09_Ventanas + "&Inspeccion_10_Espejos_Laterales=" + Inspeccion_10_Espejos_Laterales +
                    "&Inspeccion_11_Tapa_Tanque=" + Inspeccion_11_Tapa_Tanque + "&Inspeccion_12_Alarme_Retroceso=" + Inspeccion_12_Alarme_Retroceso +
                    "&Inspeccion_13_Estado_Tablero=" + Inspeccion_13_Estado_Tablero + "&Inspeccion_14_Freno_Mano=" + Inspeccion_14_Freno_Mano +
                    "&Inspeccion_15_Freno_Servicios=" + Inspeccion_15_Freno_Servicios + "&Inspeccion_16_Cinturon_Seguridad_Chofer=" + Inspeccion_16_Cinturon_Seguridad_Chofer +
                    "&Inspeccion_17_Cinturon_Pasajeros=" + Inspeccion_17_Cinturon_Pasajeros + "&Inspeccion_18_Orden_Limpieza=" + Inspeccion_18_Orden_Limpieza +
                    "&Inspeccion_19_Bocinas=" + Inspeccion_19_Bocinas + "&Inspeccion_20_Asientos=" + Inspeccion_20_Asientos +
                    "&Inspeccion_21_Llantas_Delantera_Derecha=" + Inspeccion_21_Llantas_Delantera_Derecha + "&Inspeccion_22_Llanta_Delantera_Izquierda=" + Inspeccion_22_Llanta_Delantera_Izquierda +
                    "& Inspeccion_23_Llanta_Posterior_Derecha=" + Inspeccion_23_Llanta_Posterior_Derecha + "&Inspeccion_24_Llanta_Posterior_Izquierda=" + Inspeccion_24_Llanta_Posterior_Izquierda +
                    "&Inspeccion_25_Llanta_Repuesto=" + Inspeccion_25_Llanta_Repuesto + "&Inspeccion_26_Conos_Seguridad=" + Inspeccion_26_Conos_Seguridad +
                    "&Inspeccion_27_Extintor=" + Inspeccion_27_Extintor + "&Inspeccion_28_Tricket=" + Inspeccion_28_Tricket +
                    "&Inspeccion_29_Rallon_Delantero=" + Inspeccion_29_Rallon_Delantero + "&Inspeccion_30_Rallon_Trasero=" + Inspeccion_30_Rallon_Trasero +
                    "&Inspeccion_31_Rallon_Lateral_Derecho=" + Inspeccion_31_Rallon_Lateral_Derecho + "&Inspeccion_32_Rallon_Lateral_Izquierdo=" + Inspeccion_32_Rallon_Lateral_Izquierdo +
                    "&Inspeccion_33_Tarjeta_Propiedad=" + Inspeccion_33_Tarjeta_Propiedad + "&Inspeccion_34_Tanque_Lleno=" + Inspeccion_34_Tanque_Lleno +
                    "&Inspeccion_35_Llaves=" + Inspeccion_35_Llaves;
            requestQueue = Volley.newRequestQueue(context);
            jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, listener, errorListener);
            requestQueue.add(jsonObjectRequest);
        } catch (Exception e) {
            Toast.makeText(context, "ConflictoI " + e.getMessage(), Toast.LENGTH_LONG).show();
            System.err.println("I----- " + e.getCause() + " --- " + e.getMessage());
        }

    }

    //Metodo Consultar
    public void consultar(Context context, Response.Listener listener,
                          Response.ErrorListener errorListener) {
        this.context = context;
        try {
            String url;
            url = IP_SERVER + "CheckListRautos/mostrar_sw.php";
            requestQueue = Volley.newRequestQueue(context);
            jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, listener, errorListener);
            requestQueue.add(jsonObjectRequest);
        } catch (Exception e) {
            Toast.makeText(context, "ConflictoC " + e.getMessage(), Toast.LENGTH_LONG).show();
            System.err.println("C----- " + e.getCause() + " --- " + e.getMessage());
        }
    }



}




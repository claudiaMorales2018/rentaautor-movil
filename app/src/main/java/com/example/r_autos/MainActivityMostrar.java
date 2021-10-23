package com.example.r_autos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.r_autos.complementos.Metodos;
import com.example.r_autos.complementos.RentaAuto;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivityMostrar extends AppCompatActivity implements Response.Listener<JSONObject>, Response.ErrorListener {
    ListView listView;
    ArrayList<String> listaDatos;
    ArrayList<RentaAuto> listaRentaAuto;
    Metodos metodos = new Metodos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mostrar);

        listView = findViewById(R.id.lvLitasAutos);
        metodos.consultar(this, this, this);
    }
    private void resultadoConsultaCompleta(JSONObject response){
        //Renta autos rentaAutos;
        JSONArray jsonArray = response.optJSONArray("inspeccion");
        listaRentaAuto = new ArrayList<>();
        try {
            for(int i=0;i < jsonArray.length(); i++){
                RentaAuto  RentaAuto = new RentaAuto();
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                RentaAuto.setEmpresa_Id(jsonObject.optInt("empresa_Id "));
                RentaAuto.setInspeccion_ID(jsonObject.optInt("Inspeccion_Id"));
                RentaAuto.setPedido_Linea(jsonObject.optInt("Pedido_Linea"));
                RentaAuto.setEmpleado_Id(jsonObject.optInt("Empleado_Id"));
                RentaAuto.setInspeccion_Fecha(jsonObject.optString("Inspeccion_Fecha "));
                RentaAuto.setInspeccion_Observacion(jsonObject.optString("Inspeccion_Observacion "));
                RentaAuto.setInspeccion_Resultado(jsonObject.optString("Inspeccion_Resultado"));
                RentaAuto.setInspeccion_Estado(jsonObject.optString("Inspeccion_Estado").charAt(0));
                RentaAuto.setInspeccion_01_Luz_Delantera_Alta(jsonObject.optString("Inspeccion_01_Luz_Delantera_Alta"));
                RentaAuto.setInspeccion_02_Luz_Delantera_Baja(jsonObject.optString("Inspeccion_02_Luz_Delantera_Baja"));
                RentaAuto.setInspeccion_03_Luces_Emergencia(jsonObject.optString("Inspeccion_03_Luces_Emergencia"));
                RentaAuto.setInspeccion_04_Neblinera(jsonObject.optString("Inspeccion_04_Neblinera"));
                RentaAuto.setInspeccion_05_Direccional_Delantera(jsonObject.optString("Inspeccion_05_Direccional_Delantera"));
                RentaAuto.setInspeccion_05_Direccional_Delantera(jsonObject.optString("Inspeccion_05_Direccional_Delantera"));
                RentaAuto.setInspeccion_07_Parabrisas_Delantera(jsonObject.optString("Inspeccion_07_Parabrisas_Delantera"));
                RentaAuto.setInspeccion_08_Parabrisas_Posteriores(jsonObject.optString("Inspeccion_08_Parabrisas_Posteriores"));
                RentaAuto.setInspeccion_09_Ventanas(jsonObject.optString("Inspeccion_09_Ventanas"));
                RentaAuto.setInspeccion_10_Espejos_Laterales(jsonObject.optString("Inspeccion_10_Espejos_Laterales"));
                RentaAuto.setInspeccion_11_Tapa_Tanque(jsonObject.optString("Inspeccion_11_Tapa_Tanque"));
                RentaAuto.setInspeccion_12_Alarme_Retroceso(jsonObject.optString("Inspeccion_12_Alarme_Retroceso"));
                RentaAuto.setInspeccion_13_Estado_Tablero(jsonObject.optString("Inspeccion_13_Estado_Tablero"));
                RentaAuto.setInspeccion_14_Freno_Mano(jsonObject.optString("Inspeccion_14_Freno_Mano"));
                RentaAuto.setInspeccion_15_Freno_Servicios(jsonObject.optString("Inspeccion_15_Freno_Servicios"));
                RentaAuto.setInspeccion_16_Cinturon_Seguridad_Chofer(jsonObject.optString("Inspeccion_16_Cinturon_Seguridad_Chofer"));
                RentaAuto.setInspeccion_17_Cinturon_Pasajeros(jsonObject.optString("Inspeccion_17_Cinturon_Pasajeros "));
                RentaAuto.setInspeccion_18_Orden_Limpieza(jsonObject.optString("Inspeccion_18_Orden_Limpieza"));//RentaAuto.setApellidoCliente(jsonObject.optString("apellido_cliente"));
                RentaAuto.setInspeccion_19_Bocinas(jsonObject.optString("Inspeccion_19_Bocinas"));
                RentaAuto.setInspeccion_20_Asientos(jsonObject.optString("Inspeccion_20_Asientos "));
                RentaAuto.setInspeccion_21_Llantas_Delantera_Derecha(jsonObject.optString("Inspeccion_21_Llantas_Delantera_Derecha "));
                RentaAuto.setInspeccion_22_Llanta_Delantera_Izquierda(jsonObject.optString("Inspeccion_22_Llanta_Delantera_Izquierda"));
                RentaAuto.setInspeccion_23_Llanta_Posterior_Derecha(jsonObject.optString("Inspeccion_23_Llanta_Posterior_Derecha"));
                RentaAuto.setInspeccion_24_Llanta_Posterior_Izquierda(jsonObject.optString("Inspeccion_24_Llanta_Posterior_Izquierda"));
                RentaAuto.setInspeccion_25_Llanta_Repuesto(jsonObject.optString("Inspeccion_25_Llanta_Repuesto "));
                RentaAuto.setInspeccion_26_Conos_Seguridad(jsonObject.optString("Inspeccion_26_Conos_Seguridad "));
                RentaAuto.setInspeccion_27_Extintor(jsonObject.optString("Inspeccion_27_Extintor"));
                RentaAuto.setInspeccion_28_Tricket(jsonObject.optString("Inspeccion_28_Tricket "));
                RentaAuto.setInspeccion_29_Rallon_Delantero(jsonObject.optString("Inspeccion_29_Rallon_Delantero"));
                RentaAuto.setInspeccion_30_Rallon_Trasero(jsonObject.optString("Inspeccion_30_Rallon_Trasero"));
                RentaAuto.setInspeccion_32_Rallon_Lateral_Izquierdo(jsonObject.optString("Inspeccion_32_Rallon_Lateral_Izquierdo"));
                RentaAuto.setInspeccion_33_Tarjeta_Propiedad(jsonObject.optString("Inspeccion_33_Tarjeta_Propiedad"));
                RentaAuto.setInspeccion_34_Tanque_Lleno(jsonObject.optString("Inspeccion_34_Tanque_Lleno"));
                RentaAuto.setInspeccion_35_Llaves(jsonObject.optString("Inspeccion_35_Llaves"));



















                listaRentaAuto.add(RentaAuto);
            }

            listaDatos = new ArrayList<>();
            for(int i=0;i < listaRentaAuto.size();i++){
                if(listaRentaAuto.get(i).getInspeccion_ID() != 0)
                { listaDatos.add(listaRentaAuto.get(i).getInspeccion_ID()+"," +
                        listaRentaAuto.get(i).getPedido_Id()+","+
                        listaRentaAuto.get(i).getEmpleado_Id()+", "+
                       listaRentaAuto.get(i).getInspeccion_Fecha()+","+
                       listaRentaAuto.get(i).getInspeccion_Tipo()+","+
                       listaRentaAuto.get(i).getInspeccion_Observacion()+","+
                       listaRentaAuto.get(i).getInspeccion_Estado()+","+
                      listaRentaAuto.get(i).getInspeccion_Resultado()+","+
                        listaRentaAuto.get(i).getInspeccion_01_Luz_Delantera_Alta()+", "+
                        listaRentaAuto.get(i).getInspeccion_02_Luz_Delantera_Baja()+","+
                        listaRentaAuto.get(i).getInspeccion_03_Luces_Emergencia()+","+
                        listaRentaAuto.get(i).getInspeccion_04_Neblinera()+","+
                       listaRentaAuto.get(i).getInspeccion_05_Direccional_Delantera()+","+
                        listaRentaAuto.get(i).getInspeccion_06_Direccion_Posteriores()+", "+
                        listaRentaAuto.get(i).getInspeccion_07_Parabrisas_Delantera()+","+
                        listaRentaAuto.get(i).getInspeccion_08_Parabrisas_Posteriores()+","+
                        listaRentaAuto.get(i).getInspeccion_10_Espejos_Laterales()+","+
                        listaRentaAuto.get(i).getInspeccion_11_Tapa_Tanque()+","+
         //               listaRentaAuto.get(i).getInspeccion_12_Alarme_Retroceso()+", "+
                        listaRentaAuto.get(i).getInspeccion_13_Estado_Tablero()+","+
                        listaRentaAuto.get(i).getInspeccion_14_Freno_Mano()+","+
                        listaRentaAuto.get(i).getInspeccion_15_Freno_Servicios()+","+
                        listaRentaAuto.get(i).getInspeccion_16_Cinturon_Seguridad_Chofer()+","+
                        listaRentaAuto.get(i).getInspeccion_17_Cinturon_Pasajeros()+", "+
                        listaRentaAuto.get(i).getInspeccion_18_Orden_Limpieza()+","+
                        listaRentaAuto.get(i).getInspeccion_19_Bocinas()+","+
                        listaRentaAuto.get(i). getInspeccion_20_Asientos()+","+
                        listaRentaAuto.get(i).getInspeccion_21_Llantas_Delantera_Derecha()+","+
                       listaRentaAuto.get(i).getInspeccion_22_Llanta_Delantera_Izquierda());

                }
                else {
                    Toast.makeText(this, "Lista Vacia", Toast.LENGTH_SHORT).show();
                }
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaDatos);
            listView.setAdapter(arrayAdapter);
        }
        catch (Exception e){
            Toast.makeText(this, "Error referente a C", Toast.LENGTH_LONG).show();
            System.err.println("C----- "+e.getCause()+" --- "+e.getMessage());
        }
    }
    @Override
    public void onResponse(JSONObject response) {
        this.resultadoConsultaCompleta(response);
    }
    @Override
    public void onErrorResponse(VolleyError error) {
        Toast.makeText(this, "Error respuesta a C "+error, Toast.LENGTH_LONG).show();
        System.err.println("C***** "+error);




}
}
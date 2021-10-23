package com.example.r_autos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.r_autos.complementos.Metodos;

import org.json.JSONObject;

public class MainActivityInsertar extends AppCompatActivity implements Response.Listener<JSONObject> , Response.ErrorListener {
    EditText  empresa_Id,  Inspeccion_Id, Pedido_Id,Pedido_Linea, Empleado_Id,Inspeccion_Fecha,  Inspeccion_Tipo, Inspeccion_Observacion, Inspeccion_Resultado, Inspeccion_Estado ,  Inspeccion_01_Luz_Delantera_Alta,Inspeccion_02_Luz_Delantera_Baja;
   EditText Inspeccion_03_Luces_Emergencia, Inspeccion_04_Neblinera, Inspeccion_05_Direccional_Delantera,Inspeccion_06_Direccion_Posteriores,Inspeccion_07_Parabrisas_Delantera,Inspeccion_08_Parabrisas_Posteriores;
   EditText Inspeccion_09_Ventanas, Inspeccion_10_Espejos_Laterales,Inspeccion_11_Tapa_Tanque,Inspeccion_12_Alarme_Retroceso,Inspeccion_13_Estado_Tablero,Inspeccion_14_Freno_Mano, Inspeccion_15_Freno_Servicios;
   EditText   Inspeccion_16_Cinturon_Seguridad_Chofer,Inspeccion_17_Cinturon_Pasajeros, Inspeccion_18_Orden_Limpieza, Inspeccion_19_Bocinas, Inspeccion_20_Asientos, Inspeccion_21_Llantas_Delantera_Derecha, Inspeccion_22_Llanta_Delantera_Izquierda;
   EditText Inspeccion_23_Llanta_Posterior_Derecha, Inspeccion_24_Llanta_Posterior_Izquierda, Inspeccion_25_Llanta_Repuesto, Inspeccion_26_Conos_Seguridad, Inspeccion_27_Extintor, Inspeccion_28_Tricket, Inspeccion_29_Rallon_Delantero, Inspeccion_30_Rallon_Trasero;
   EditText Inspeccion_31_Rallon_Lateral_Derecho, Inspeccion_32_Rallon_Lateral_Izquierdo, Inspeccion_33_Tarjeta_Propiedad, Inspeccion_34_Tanque_Lleno, Inspeccion_35_Llaves;


    Metodos metodos = new Metodos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_insertar);


        empresa_Id = findViewById(R.id.empresa_Id);
        Inspeccion_Id = findViewById(R.id.Inspeccion_Id);
        Pedido_Id= findViewById(R.id.Pedido_Id);
        Pedido_Linea = findViewById(R.id.Pedido_Linea);
        Empleado_Id = findViewById(R.id.Empleado_Id);
        Inspeccion_Fecha = findViewById(R.id.InspeccionFecha);
        Inspeccion_Tipo = findViewById(R.id.Inspeccion_Tipo);
        Inspeccion_Observacion = findViewById(R.id.Inspeccion_Observacion);
        Inspeccion_Estado = findViewById(R.id.Inspeccion_Estado);
        Inspeccion_Resultado = findViewById(R.id.Inspeccion_Resultado);
        Inspeccion_01_Luz_Delantera_Alta= findViewById(R.id.Inspeccion_01_Luz_Delantera_Alta);
        Inspeccion_02_Luz_Delantera_Baja= findViewById(R.id.Inspeccion_02_Luz_Delantera_Baja);
        Inspeccion_03_Luces_Emergencia= findViewById(R.id.Inspeccion_03_Luces_Emergencia);
        Inspeccion_04_Neblinera= findViewById(R.id.Inspeccion_04_Neblinera);
        Inspeccion_05_Direccional_Delantera= findViewById(R.id.Inspeccion_05_Direccional_Delantera);
        Inspeccion_06_Direccion_Posteriores= findViewById(R.id.Inspeccion_06_Direccion_Posteriores);
        Inspeccion_07_Parabrisas_Delantera= findViewById(R.id.Inspeccion_07_Parabrisas_Delantera);
        Inspeccion_08_Parabrisas_Posteriores= findViewById(R.id.Inspeccion_08_Parabrisas_Posteriores);
        Inspeccion_09_Ventanas= findViewById(R.id.Inspeccion_09_Ventanas);
        Inspeccion_10_Espejos_Laterales = findViewById(R.id.Inspeccion_10_Espejos_Laterales);
        Inspeccion_11_Tapa_Tanque= findViewById(R.id.Inspeccion_11_Tapa_Tanque);
        Inspeccion_12_Alarme_Retroceso= findViewById(R.id.Inspeccion_12_Alarme_Retroceso);
        Inspeccion_13_Estado_Tablero= findViewById(R.id.Inspeccion_13_Estado_Tablero);
        Inspeccion_14_Freno_Mano= findViewById(R.id.Inspeccion_14_Freno_Mano);
        Inspeccion_15_Freno_Servicios= findViewById(R.id.Inspeccion_15_Freno_Servicios);
        Inspeccion_16_Cinturon_Seguridad_Chofer= findViewById(R.id.Inspeccion_16_Cinturon_Seguridad_Chofer);
        Inspeccion_17_Cinturon_Pasajeros = findViewById(R.id.Inspeccion_17_Cinturon_Pasajeros);
        Inspeccion_18_Orden_Limpieza= findViewById(R.id.Inspeccion_18_Orden_Limpieza);
        Inspeccion_19_Bocinas = findViewById(R.id.Inspeccion_19_Bocinas);
        Inspeccion_20_Asientos= findViewById(R.id.Inspeccion_20_Asientos);
        Inspeccion_21_Llantas_Delantera_Derecha= findViewById(R.id.Inspeccion_21_Llantas_Delantera_Derecha);
        Inspeccion_22_Llanta_Delantera_Izquierda = findViewById(R.id.Inspeccion_22_Llanta_Delantera_Izquierda);
        Inspeccion_23_Llanta_Posterior_Derecha= findViewById(R.id.Inspeccion_23_Llanta_Posterior_Derecha);
        Inspeccion_24_Llanta_Posterior_Izquierda= findViewById(R.id.Inspeccion_24_Llanta_Posterior_Izquierda);
        Inspeccion_25_Llanta_Repuesto= findViewById(R.id.Inspeccion_25_Llanta_Repuesto);
        Inspeccion_26_Conos_Seguridad= findViewById(R.id.Inspeccion_26_Conos_Seguridad);
        Inspeccion_27_Extintor= findViewById(R.id.Inspeccion_27_Extintor);
        Inspeccion_28_Tricket= findViewById(R.id.Inspeccion_28_Tricket);
        Inspeccion_29_Rallon_Delantero= findViewById(R.id.Inspeccion_29_Rallon_Delantero);
        Inspeccion_30_Rallon_Trasero = findViewById(R.id.Inspeccion_30_Rallon_Trasero);
        Inspeccion_31_Rallon_Lateral_Derecho = findViewById(R.id.Inspeccion_31_Rallon_Lateral_Derecho);
        Inspeccion_32_Rallon_Lateral_Izquierdo= findViewById(R.id.Inspeccion_32_Rallon_Lateral_Izquierdo);
        Inspeccion_33_Tarjeta_Propiedad= findViewById(R.id.Inspeccion_33_Tarjeta_Propiedad);
        Inspeccion_34_Tanque_Lleno=findViewById(R.id.Inspeccion_34_Tanque_Lleno);
        Inspeccion_35_Llaves= findViewById(R.id.Inspeccion_35_Llaves);
    }

    public void onClick(View view) {
        this.InsertarD();


    }

    public void InsertarD() {
        if (!empresa_Id.getText().toString().isEmpty() &&
                !Inspeccion_Id.getText().toString().isEmpty() &&
                !Pedido_Id.getText().toString().isEmpty() &&
                !Pedido_Linea .getText().toString().isEmpty() &&
                !Empleado_Id.getText().toString().isEmpty() &&
                !Inspeccion_Fecha.getText().toString().isEmpty() &&
                !Inspeccion_Tipo.getText().toString().isEmpty() &&
                !Inspeccion_Estado.getText().toString().isEmpty() &&
                !Inspeccion_Observacion.getText().toString().isEmpty() &&
                !Inspeccion_Resultado.getText().toString().isEmpty() &&
                !Inspeccion_Estado.getText().toString().isEmpty() &&
                !Inspeccion_01_Luz_Delantera_Alta.getText().toString().isEmpty() &&
                !Inspeccion_02_Luz_Delantera_Baja.getText().toString().isEmpty() &&
                !Inspeccion_03_Luces_Emergencia.getText().toString().isEmpty() &&
                !Inspeccion_04_Neblinera.getText().toString().isEmpty() &&
                !Inspeccion_05_Direccional_Delantera.getText().toString().isEmpty() &&
                !Inspeccion_06_Direccion_Posteriores.getText().toString().isEmpty() &&
                !Inspeccion_07_Parabrisas_Delantera.getText().toString().isEmpty() &&
                !Inspeccion_08_Parabrisas_Posteriores.getText().toString().isEmpty() &&
                !Inspeccion_09_Ventanas.getText().toString().isEmpty() &&
                !Inspeccion_10_Espejos_Laterales.getText().toString().isEmpty() &&
                !Inspeccion_11_Tapa_Tanque.getText().toString().isEmpty() &&
                !Inspeccion_12_Alarme_Retroceso.getText().toString().isEmpty() &&
                !Inspeccion_13_Estado_Tablero.getText().toString().isEmpty() &&
                !Inspeccion_14_Freno_Mano.getText().toString().isEmpty() &&
                !Inspeccion_15_Freno_Servicios.getText().toString().isEmpty() &&
                !Inspeccion_16_Cinturon_Seguridad_Chofer.getText().toString().isEmpty() &&
                !Inspeccion_17_Cinturon_Pasajeros.getText().toString().isEmpty() &&
                !Inspeccion_18_Orden_Limpieza.getText().toString().isEmpty() &&
                !Inspeccion_19_Bocinas.getText().toString().isEmpty() &&
                !Inspeccion_20_Asientos.getText().toString().isEmpty() &&
                !Inspeccion_21_Llantas_Delantera_Derecha.getText().toString().isEmpty() &&
                !Inspeccion_22_Llanta_Delantera_Izquierda.getText().toString().isEmpty() &&
                !Inspeccion_23_Llanta_Posterior_Derecha.getText().toString().isEmpty() &&
                !Inspeccion_24_Llanta_Posterior_Izquierda.getText().toString().isEmpty() &&
                !Inspeccion_25_Llanta_Repuesto.getText().toString().isEmpty() &&
                !Inspeccion_26_Conos_Seguridad.getText().toString().isEmpty() &&
                !Inspeccion_27_Extintor.getText().toString().isEmpty() &&
                !Inspeccion_28_Tricket.getText().toString().isEmpty() &&
                !Inspeccion_29_Rallon_Delantero.getText().toString().isEmpty() &&
                !Inspeccion_30_Rallon_Trasero.getText().toString().isEmpty() &&
                !Inspeccion_31_Rallon_Lateral_Derecho.getText().toString().isEmpty() &&
                !Inspeccion_32_Rallon_Lateral_Izquierdo.getText().toString().isEmpty() &&
                !Inspeccion_33_Tarjeta_Propiedad.getText().toString().isEmpty() &&
                !Inspeccion_34_Tanque_Lleno.getText().toString().isEmpty() &&
                !Inspeccion_35_Llaves.getText().toString().isEmpty()) {


            //utilzamos el metodo respectivo de la clase Metodos
            metodos.Insertar(this, Integer.parseInt(empresa_Id.getText().toString()),
                    Integer.parseInt(Inspeccion_Id.getText().toString()),
                    Integer.parseInt(Pedido_Id.getText().toString()),
                    Integer.parseInt(Pedido_Linea.getText().toString()),
                    Integer.parseInt(Empleado_Id.getText().toString()),
                    Inspeccion_Fecha.getText().toString(),
                    Inspeccion_Tipo.getText().toString(),
                    Inspeccion_Observacion.getText().toString(),
                    Inspeccion_Resultado.getText().toString(),
                    Inspeccion_Estado.getText().toString(),
                    Inspeccion_01_Luz_Delantera_Alta.getText().toString(),
                  Inspeccion_02_Luz_Delantera_Baja.getText().toString(),
                    Inspeccion_03_Luces_Emergencia.getText().toString(),
                    Inspeccion_04_Neblinera.getText().toString(),
                          Inspeccion_05_Direccional_Delantera.getText().toString(),
                    Inspeccion_06_Direccion_Posteriores.getText().toString(),
                           Inspeccion_07_Parabrisas_Delantera.getText().toString(),
                            Inspeccion_08_Parabrisas_Posteriores.getText().toString(),
                         Inspeccion_09_Ventanas.getText().toString(),
                           Inspeccion_10_Espejos_Laterales.getText().toString(),
                           Inspeccion_11_Tapa_Tanque.getText().toString(),
                            Inspeccion_12_Alarme_Retroceso.getText().toString(),
                            Inspeccion_13_Estado_Tablero.getText().toString(),
                           Inspeccion_14_Freno_Mano.getText().toString(),
                           Inspeccion_15_Freno_Servicios.getText().toString(),
                           Inspeccion_16_Cinturon_Seguridad_Chofer.getText().toString(),
                           Inspeccion_17_Cinturon_Pasajeros.getText().toString(),
                           Inspeccion_18_Orden_Limpieza.getText().toString(),
                           Inspeccion_19_Bocinas.getText().toString(),
                            Inspeccion_20_Asientos.getText().toString(),
                            Inspeccion_21_Llantas_Delantera_Derecha.getText().toString(),
                           Inspeccion_22_Llanta_Delantera_Izquierda.getText().toString(),
                           Inspeccion_23_Llanta_Posterior_Derecha.getText().toString(),
                           Inspeccion_24_Llanta_Posterior_Izquierda.getText().toString(),
                           Inspeccion_25_Llanta_Repuesto.getText().toString(),
                        Inspeccion_26_Conos_Seguridad.getText().toString(),
                            Inspeccion_27_Extintor.getText().toString(),
                           Inspeccion_28_Tricket.getText().toString(),
                           Inspeccion_29_Rallon_Delantero.getText().toString(),
                           Inspeccion_30_Rallon_Trasero.getText().toString(),
                           Inspeccion_31_Rallon_Lateral_Derecho.getText().toString(),
                           Inspeccion_32_Rallon_Lateral_Izquierdo.getText().toString(),
                            Inspeccion_33_Tarjeta_Propiedad.getText().toString(),
                           Inspeccion_34_Tanque_Lleno.getText().toString(),
                         Inspeccion_35_Llaves.getText().toString(),this,this);



                    empresa_Id.setText("");
                    Inspeccion_Id.setText("");
                    Pedido_Linea.setText("");
                    Empleado_Id.setText("");
                    Inspeccion_Fecha.setText("");
                    Inspeccion_Tipo.setText("");
                    Inspeccion_Observacion.setText("");
                    Inspeccion_Resultado.setText("");
                    Inspeccion_Estado.setText("");
                    Inspeccion_01_Luz_Delantera_Alta.setText("");
                    Inspeccion_02_Luz_Delantera_Baja.setText("");
                     Inspeccion_03_Luces_Emergencia.setText("");
                    Inspeccion_04_Neblinera.setText("");
                    Inspeccion_05_Direccional_Delantera.setText("");
                    Inspeccion_06_Direccion_Posteriores.setText("");
                    Inspeccion_07_Parabrisas_Delantera.setText("");
                    Inspeccion_08_Parabrisas_Posteriores.setText("");
                      Inspeccion_09_Ventanas.setText("");
                    Inspeccion_10_Espejos_Laterales.setText("");
                    Inspeccion_11_Tapa_Tanque.setText("");
                    Inspeccion_12_Alarme_Retroceso.setText("");
                    Inspeccion_13_Estado_Tablero.setText("");
                    Inspeccion_14_Freno_Mano.setText("");
                    Inspeccion_15_Freno_Servicios.setText("");
                    Inspeccion_16_Cinturon_Seguridad_Chofer.setText("");
                    Inspeccion_17_Cinturon_Pasajeros.setText("");
                    Inspeccion_18_Orden_Limpieza.setText("");
                    Inspeccion_19_Bocinas.setText("");
                    Inspeccion_20_Asientos.setText("");
                    Inspeccion_21_Llantas_Delantera_Derecha.setText("");
                            Inspeccion_22_Llanta_Delantera_Izquierda.setText("");
                Inspeccion_23_Llanta_Posterior_Derecha.setText("");
                    Inspeccion_24_Llanta_Posterior_Izquierda.setText("");
                    Inspeccion_25_Llanta_Repuesto.setText("");
                    Inspeccion_26_Conos_Seguridad.setText("");
                            Inspeccion_27_Extintor.setText("");
                    Inspeccion_28_Tricket.setText("");
                    Inspeccion_29_Rallon_Delantero.setText("");
                    Inspeccion_30_Rallon_Trasero.setText("");
                     Inspeccion_31_Rallon_Lateral_Derecho.setText("");
                    Inspeccion_32_Rallon_Lateral_Izquierdo.setText("");
                    Inspeccion_33_Tarjeta_Propiedad.setText("");
                    Inspeccion_34_Tanque_Lleno.setText("");
                    Inspeccion_35_Llaves.setText("");




        }

        else {
            Toast.makeText(this, "Debe de llenar todos los campos", Toast.LENGTH_SHORT).show();
        }

            }




        @Override
        public void onResponse (JSONObject response){
            Toast.makeText(this, "Datos Insertados Correctamente", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onErrorResponse (VolleyError error){
            Toast.makeText(this, "Error referente a I " + error, Toast.LENGTH_SHORT).show();
            System.err.println("I***** " + error);
        }
    }

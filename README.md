# GeneradorZip
El Generador Zip crea carpetas y archivos, luego logra organizar las carpetas y archivos con los parametros dados.


Este código muestra la forma en la que se organiza y se crean las carpetas.

 ```java
  for (Map.Entry<String, Map<String, List<Gom>>> entry : mostrar.entrySet()) {
                String key = entry.getKey();
                Map<String, List<Gom>> value = entry.getValue();
                for (Map.Entry<String, List<Gom>> entry1 : value.entrySet()) {
                    String key1 = entry1.getKey();
                    List<Gom> value1 = entry1.getValue();
                    for (Gom listaDeGom : value1) {
                        manager.crear(key + "/" + key1 +"-"+ key, "gom" + listaDeGom.getNumeroGom()
                                + ".txt", "contenido del gom" + listaDeGom.getNumeroGom());
                    }

                }
            }
 ```


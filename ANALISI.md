
| # | Mala pràctica | On (classe/mètode/var.) | Patró de refacció suggerit |
|---|---------------------------------------------|-------------------------|----------------------------|
| 1 | Múltiples responsabilidades (Violación SRP) | Método programarSessio (busca datos, valida reglas, crea objetos e imprime) | Extraer Método (Extract Method) / Mover lógica a Repositorios |
| 2 | Códigos de retorno para errores | Método programarSessio (múltiples return "Error: ...";) | Reemplazar código de error por Excepción (Replace Error Code with Exception) |
| 3 | Mezclar lógica con presentación | Método programarSessio (líneas con System.out.println) | Eliminar prints; delegar la impresión a la capa de interfaz |
| 4 | Duplicación de código (Búsquedas) | Método programarSessio (bucles for idénticos para buscar salas y películas) | Extraer Método (Ej: buscarSalaPorId, buscarFilmPorTitulo) |
| 5 | Obsesión Primitiva (Primitive Obsession) | Parámetro String hora en programarSessio | Usar objetos adecuados de Java (ej: LocalTime o LocalDateTime) |

 
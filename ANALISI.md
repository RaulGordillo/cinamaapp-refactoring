| # | Mala práctica | Dónde (clase/método/var.) | Patrón de refactorización sugerido |
|---|---|---|---|
| 1 | Nombres incomprensibles (Bad Naming) | Clase `R`, método `proc`, variables `t`, `s`, `pp`, `ll` | Renombrar (Utilizar nombres significativos y descriptivos) |
| 2 | Números y Cadenas Mágicas (Magic Numbers/Strings) | Método `proc` (valores como "pe", "vip", 0.85, 0.70, 8) | Extraer Constantes (Replace Magic Number with Symbolic Constant) o usar Enums |
| 3 | Múltiples responsabilidades (Violación SRP de SOLID) | Método `proc` (calcula precios, imprime por consola y guarda datos) | Extraer Método (Extract Method) para separar la lógica |
| 4 | Anidación profunda (Arrow Code / Deep Nesting) | Método `proc` (múltiples bloques `if` anidados, líneas 5-13) | Cláusulas de guarda (Guard Clauses / Return early) |
| 5 | Violación de Abierto/Cerrado (Violación OCP de SOLID) | Método `proc` (cadenas de `if` para los tipos "pe" o "vip") | Sustituir condicional por Polimorfismo (Patrón Strategy) |

| # | Mala pràctica | On (classe/mètode/var.) | Patró de refacció suggerit |
|---|---------------------------------------------|-------------------------|----------------------------|
| 1 | Múltiples responsabilidades (Violación SRP) | Método programarSessio (busca datos, valida reglas, crea objetos e imprime) | Extraer Método (Extract Method) / Mover lógica a Repositorios |
| 2 | Códigos de retorno para errores | Método programarSessio (múltiples return "Error: ...";) | Reemplazar código de error por Excepción (Replace Error Code with Exception) |
| 3 | Mezclar lógica con presentación | Método programarSessio (líneas con System.out.println) | Eliminar prints; delegar la impresión a la capa de interfaz |
| 4 | Duplicación de código (Búsquedas) | Método programarSessio (bucles for idénticos para buscar salas y películas) | Extraer Método (Ej: buscarSalaPorId, buscarFilmPorTitulo) |
| 5 | Obsesión Primitiva (Primitive Obsession) | Parámetro String hora en programarSessio | Usar objetos adecuados de Java (ej: LocalTime o LocalDateTime) |

 

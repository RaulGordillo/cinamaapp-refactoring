| # | Mala práctica | Dónde (clase/método/var.) | Patrón de refactorización sugerido |
|---|---|---|---|
| 1 | Nombres incomprensibles (Bad Naming) | Clase `R`, método `proc`, variables `t`, `s`, `pp`, `ll` | Renombrar (Utilizar nombres significativos y descriptivos) |
| 2 | Números y Cadenas Mágicas (Magic Numbers/Strings) | Método `proc` (valores como "pe", "vip", 0.85, 0.70, 8) | Extraer Constantes (Replace Magic Number with Symbolic Constant) o usar Enums |
| 3 | Múltiples responsabilidades (Violación SRP de SOLID) | Método `proc` (calcula precios, imprime por consola y guarda datos) | Extraer Método (Extract Method) para separar la lógica |
| 4 | Anidación profunda (Arrow Code / Deep Nesting) | Método `proc` (múltiples bloques `if` anidados, líneas 5-13) | Cláusulas de guarda (Guard Clauses / Return early) |
| 5 | Violación de Abierto/Cerrado (Violación OCP de SOLID) | Método `proc` (cadenas de `if` para los tipos "pe" o "vip") | Sustituir condicional por Polimorfismo (Patrón Strategy) |
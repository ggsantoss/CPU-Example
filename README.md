## CPU Example

Funcionamento de uma CPU em Java.

Etapas para execução de cada instrução: (buscar-decodificar-executar.) (Fundamental para o funcionamento de todos os computadores).
1. Trazer a próxima instrução da memória até o registrador de instrução.
2. Alterar o contador de programa para que aponte para a próxima instrução.
3. Determinar o tipo de instrução trazida.
4. Se a instrução usar uma palavra na memória, determinar onde essa palavra está.
5. Trazer a palavra para dentro de um registrador da CPU, se necessário.
6. Executar a instrução.
7. Voltar à etapa 1 para inicar a execução da instrução seguinte.

<img width="683" height="483" alt="image" src="https://github.com/user-attachments/assets/7d42a519-4563-402d-bdcf-10c562c644bb" />

Unidade de controle: Responsavel por buscar instruções na memória principal e determinar seu tipo.

Unidade Lógica Aritmética (ULA): Efetua operações como adição e AND (E) booleano para executar as instruções.

A CPU também contém uma pequena memória de alta velocidade para armazenar resultados temporários. (Formada de registradores)

O registrador mais importante é o Contador de Programa (PC - Program Counter) que busca a próxima instrução a ser executada.

Registrador de Instrução (IR - Instruction Register), que mantém a instrução que está sendo executada no momento em questão.

public class Main {
    public static void main(String[] args) {
        int[] memory = new int[16];

        memory[0] = 0x13; // ADD posição 3
        memory[1] = 0x23; // SUB posição 3
        memory[2] = 0x03; // LOAD posição 3
        memory[3] = 7;    // valor = 7
        memory[4] = 0x14; // ADD posição 4
        memory[5] = 15;   // valor = 15
        memory[6] = 0x04; // STORE posição 4 (não modifica memória neste exemplo, só mostra)
        memory[7] = 0x00; // HALT

        System.out.println("=== Início da execução ===");
        Interp.interpret(memory, 0);
        System.out.println("=== Fim da execução ===");
        System.out.println("AC final: " + Interp.AC);
    }
}

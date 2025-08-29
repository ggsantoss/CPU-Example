// Interp.java
public class Interp {
    static int PC;          // contador de programa, esse busca a próxima instrução a ser executada.
    static int AC;          // acumulador, um registrador para efetuar aritmética.
    static int instr;       // instrução corrente, a que está sendo executada no momento (Famoso registrador IR).
    static int instr_type;  // tipo da instrução (opcode), indica qual operação será executada (ADD, SUB, LOAD, HALT, etc.)
    static int data_loc;    // endereço dos dados ou -1 se nenhum
    static int data;        // operando corrente, valor que será usado nas operações
    static boolean run_bit = true; // bit de funcionamento

    public static void interpret(int memory[], int starting_address) {
        PC = starting_address;

        while (run_bit) {
            instr = memory[PC];       // busca a próxima instrução
            PC = PC + 1;              // incrementa contador de programa
            instr_type = get_instr_type(instr);  
            data_loc = find_data(instr, instr_type);  

            if (data_loc >= 0)          // se houver operando
                data = memory[data_loc];  

            execute(instr_type, data);  
        }
    }

    private static int get_instr_type(int instr) {
        // opcode nos 4 bits mais significativos
        return (instr >> 4) & 0xF;
    }

    private static int find_data(int instr, int type) {
        if (type == 0) return -1; // HALT não tem operando
        // endereço nos 4 bits menos significativos
        return instr & 0xF;
    }

    private static void execute(int type, int data) {
        switch(type) {
            case 0: // HALT
                run_bit = false;
                System.out.println("HALT");
                break;
            case 1: // ADD
                AC += data;
                System.out.println("ADD " + data + " -> AC = " + AC);
                break;
            case 2: // SUB
                AC -= data;
                System.out.println("SUB " + data + " -> AC = " + AC);
                break;
            case 3: // LOAD
                AC = data;
                System.out.println("LOAD " + data + " -> AC = " + AC);
                break;
            case 4: // STORE
                System.out.println("STORE " + AC + " -> memória[" + data + "]");
                // aqui poderia armazenar AC na memória se quisesse
                break;
            default:
                System.out.println("Instrucao desconhecida: " + type);
                run_bit = false;
        }
    }
}

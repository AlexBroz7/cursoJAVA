public class testFuncionario {
    public static void main(String[] args) {
        funcionario diego = new funcionario();
        diego.setNombre("Diego");
        diego.setDocumento("45678930987");
        diego.setSalario(2000);
        diego.setTipo(0);

        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());
    }
}

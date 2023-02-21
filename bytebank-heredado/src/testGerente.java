public class testGerente {
    public static void main(String[] args) {
        gerente gerente = new gerente();
       // gerente.setSalario(5000);

        //funcionario gerente = new funcionario();
        gerente.setSalario(6000);
        gerente.setClave("cursos");
        gerente.setTipo(1);
        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("cursos"));
    }
}

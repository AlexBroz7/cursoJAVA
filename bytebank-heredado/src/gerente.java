public class gerente extends funcionario{

        private String clave;
    public void setClave(String clave){
        this.clave = clave;
    }
    public boolean iniciarSesion(String clave){
        return clave == "cursos";
    }
    public double getBonificacion(){
        return super.getSalario();
    }

}

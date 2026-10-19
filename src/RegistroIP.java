public class RegistroIP {
    private String direccionIP;
    private String horaAcceso;
    private boolean permitida;

    public RegistroIP(String direccionIP, String horaAcceso, boolean permitida) {
        this.direccionIP = direccionIP;
        this.horaAcceso = horaAcceso;
        this.permitida = permitida;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public String getHoraAcceso() {
        return horaAcceso;
    }

    public void setHoraAcceso(String horaAcceso) {
        this.horaAcceso = horaAcceso;
    }

    public boolean isPermitida() {
        return permitida;
    }

    public void setPermitida(boolean permitida) {
        this.permitida = permitida;
    }

    public void mostrarEstado() {
        if (permitida) {
            System.out.println("La IP " + direccionIP + " (" + horaAcceso + ") tiene acceso PERMITIDO.");
        } else {
            System.out.println("La IP " + direccionIP + " (" + horaAcceso + ") tiene acceso DENEGADO.");
        }
    }
}
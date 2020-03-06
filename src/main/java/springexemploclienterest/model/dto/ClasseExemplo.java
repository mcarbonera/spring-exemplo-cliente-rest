package springexemploclienterest.model.dto;

public class ClasseExemplo {
    /**
     * é possível definir valores not null usando anotação @NotBlank
     * Validações podem ser feitas com @Min()
     */
    // Parametros default:
    private String param1 = "";
    private String param2 = "";
    private String param3 = "";

    public ClasseExemplo(String param1, String param2, String param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    public ClasseExemplo() {
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClasseExemplo{");
        sb.append("param1='").append(param1).append('\'');
        sb.append(", param2='").append(param2).append('\'');
        sb.append(", param3='").append(param3).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
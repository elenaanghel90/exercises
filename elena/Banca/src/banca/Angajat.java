package banca;

import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Angajat extends Persoana{
    private RolAngajat rolAngajat;
    public enum RolAngajat{DIRECTOR, CASIER, AGENT_VANZARI};
    private Integer codAngajat;
    private Banca banca; //vedem unde lucreaza angajatul

    public RolAngajat getRolAngajat(){
        return rolAngajat;
    }

    public void setRolAngajatRolAngajat(){
        this.rolAngajat = rolAngajat;
    }
    public Angajat(String cnp, String nume, Banca banca, String rol, Integer codAngajat){
        super(cnp, nume);
        this.rolAngajat = getRolAngajat();
        this.codAngajat = codAngajat;
    }

//    public String getCodAngajat(){
//        return codAngajat;
//    }

    public Integer getCodAngajat(){
        return codAngajat;
    }
    public void setCodAngajat(Integer codAngajat){
        this.codAngajat = codAngajat;
    }

    public String deschideCont(Client client){ //angajatul cere lista de conturi de la banca
        if(getRolAngajat()!=RolAngajat.AGENT_VANZARI){
            return null;
        }
        Cont contNou = new Cont(UUID.randomUUID().toString());
        client.setCont(contNou);
    }
    public Boolean inchidereCont(Client client){
        if(getRolAngajat()!=RolAngajat.AGENT_VANZARI || getRolAngajat()!=rolAngajat.DIRECTOR){
            return null;
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Angajat)){
            return false;
        }
       Angajat concreteObj = (Angajat) obj;
        if(this.getCnp().equals(((Angajat) concreteObj).getCnp())){
            return true;
        }
        else{
            return true;
        }
    }
}

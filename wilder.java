public class wilder {
    private String firstname ;
    private boolean aware ;

    // public wilder(String firstname){
    //     this.firstname= firstname;
    //     this.aware= false;
    // }


public wilder(String firstname , boolean aware){
    this.firstname= firstname;
    this.aware=aware;
}
public String getFirst(){
    return this.firstname;
}

public boolean getAware(){
    return this.aware;

}




public void setFirstname(String firstname) {
    this.firstname = firstname;
}




public void setAware(boolean aware) {
    this.aware = aware;
}






String whoAmI(){
    if(aware){
    return  "je m'appelle " + this.getFirst() + " et je suis aware" ;
} else {
    return "je m'appelle " + this.getFirst() + " et je ne suis pas aware" ;
}}}

;

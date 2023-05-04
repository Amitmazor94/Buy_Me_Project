package data;


public class Data {
private String mailErrorMessage="כל המתנות מחכות לך! אבל קודם צריך מייל וסיסמה";
private String passwordErrorMessage= "כל המתנות מחכות לך! אבל קודם צריך מייל וסיסמה";

public void setMailErrorMessage(String mailErrorMessage){
    this.mailErrorMessage=mailErrorMessage;
}
public void setPasswordErrorMessage(String passwordErrorMessage){
    this.passwordErrorMessage=passwordErrorMessage;
}
public String getMailErrorMessage(){
    return mailErrorMessage;
}
public String getPasswordErrorMessage(){
    return passwordErrorMessage;
}
}

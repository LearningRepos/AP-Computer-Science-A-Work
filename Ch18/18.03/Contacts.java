class Contacts {
  private String name;
  private String relation;
  private String birthday;
  private String number;
  private String email;

  public Contacts(String name, String relation, String birthday, String number, String email){
    this.name = name;
    this.relation = relation;
    this.birthday = birthday;
    this.number = number; 
    this.email = email;
  }

  public String getName(){
    return name;
  }

  public String getRelation(){
    return relation;
  }

  public String getBirthday(){
    return birthday;
  }

  public String getNumber(){
    return number;
  }

  public String getEmail(){
    return email;
  }

  public void setName(String Name){
    name = Name;
  }

  public void setRelation( String Relation){
    relation = Relation;
  }

  public void setBirthday(String Birthday){
    birthday = Birthday;
  }

  public void setNumber(String Number){
    number = Number;
  }

  public void setEmail(String Email){
    email = Email;
  }

  public String toString(){
    return getName() + " " + getRelation() + " " + getBirthday() + " " +getNumber() + " " + getEmail();
  }
}
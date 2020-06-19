//Name : Mihir Achyuta
//Date : 6/17/20
//Purpose : To utilize sorting for binary searches and utilize linear searches
//PMR; This was a normal assignment for me as I went through the sorting section well and the previous searching programs well so this assignment was good. 
class Main {
  public static void main(String[] args) {
    Contacts[] array = new Contacts[10];
    array[0] = new Contacts("Bart", "brother", "Jan 1", "111-111-1111", "bart@gmail.com");
    array[1] = new Contacts("Lisa", "sister", "Feb 2", "435-111-5435", "lisa@gmail.com");
    array[2] = new Contacts("Apu", "uncle", "March 3", "565-111-5434", "null@gmail.com");
    array[3] = new Contacts("Willie", "uncle", "May 1", "342-111-4323", "will@gmail.com");
    array[4] = new Contacts("Ralph", "friend", "Feb 13", "344-111-6545", "null@gmail.com");
    array[5] = new Contacts("Millhouse", "friend", "Dec 6", "524-111-6543", "mill@gmail.com");
    array[6] = new Contacts("Skinner", "principal", "Nov 10", "234-111-2342", "skin@gmail.com");
    array[7] = new Contacts("Chalmers", "principal", "Jan 31", "312-111-4231", "ch@gmail.com");
    array[8] = new Contacts("Marge", "parent", "Feb 32 ", "111-111-1111", "marg@gmail.com");
    array[9] = new Contacts("Homer", "parent", "Jan 21", "111-4324-312", "homer@gmail.com");

    System.out.println("Original Array");
    traverse(array);
    System.out.println();

    System.out.println("Certain emails from array");
    System.out.println(EmailSearch(array, "null@gmail.com"));
    System.out.println();

    System.out.println("Failed Certain emails from array");
    System.out.println(EmailSearch(array, "nulewqweqel@gmail.com"));
    System.out.println();

    System.out.println("Certain phone # from array");
    System.out.println(PhoneSearch(array, "111-111-1111"));
    System.out.println();

    System.out.println("Failed Certain phone # from array");
    System.out.println(PhoneSearch(array, "wqer3424-32-3234"));
    System.out.println();

    System.out.println("Certain Birthdays from array");
    System.out.println(BirthSearch(array, "Jan"));
    System.out.println();

    System.out.println("Failed Certain Birthdays from array");
    System.out.println(BirthSearch(array, "Jun"));
    System.out.println();

    System.out.println("Name Insertion Sorted Array");
    NameSort(array);
    traverse(array);
    System.out.println();

    System.out.println("Binary Search for Millhouse by Name");
    BinaryName(array, "Millhouse");
    System.out.println();

    System.out.println("Failed Binary Search by Name");
    BinaryName(array, "Mill");
    System.out.println();

    System.out.println("Relation Insertion Sorted Array");
    RelationSort(array);
    traverse(array);
    System.out.println();

    System.out.println("Binary Search for principal by Relationship");
    BinaryRelationship(array, "principal");
    System.out.println();

    System.out.println("Failed Binary Search by relationship");
    BinaryRelationship(array, "grandfather");
    System.out.println();

  }

  public static void traverse(Contacts[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i].toString());
    }
  }

  public static String EmailSearch(Contacts[] arr, String value) {
    String sum = "";
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].getEmail().equals(value)) {
        sum += arr[i].getName() + " email " + arr[i].getEmail() + "  ";
      }
    }
    if (sum.length() > 0) {
      return sum;
    }
    return "Not Found";
  }

  public static String PhoneSearch(Contacts[] arr, String value) {
    String sum = "";
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].getNumber().equals(value)) {
        sum += arr[i].getName() + " phone " + arr[i].getNumber() + "  ";
      }
    }
    if (sum.length() > 0) {
      return sum;
    }
    return "Not Found";
  }

  public static String BirthSearch(Contacts[] arr, String value) {
    String sum = "";
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].getBirthday().contains(value)) {
        sum += arr[i].getName() + " birthday " + arr[i].getBirthday() + "  ";
      }
    }
    if (sum.length() > 0) {
      return sum;
    }
    return "Not Found";
  }

  public static void NameSort(Contacts[] array) {
    for (int i = 1; i < array.length; i++) {
      for (int j = 0; j < i; j++) {
        if (array[i].getName().compareTo(array[j].getName()) < 0) {
          String nameTemp = array[i].getName();
          String relationTemp = array[i].getRelation();
          String birthTemp = array[i].getBirthday();
          String numTemp = array[i].getNumber();
          String emailTemp = array[i].getEmail();

          array[i].setName(array[j].getName());
          array[i].setRelation(array[j].getRelation());
          array[i].setBirthday(array[j].getBirthday());
          array[i].setNumber(array[j].getNumber());
          array[i].setEmail(array[j].getEmail());

          array[j].setName(nameTemp);
          array[j].setRelation(relationTemp);
          array[j].setBirthday(birthTemp);
          array[j].setNumber(numTemp);
          array[j].setEmail(emailTemp);
        }
      }
    }
  }

  public static void BinaryRelationship(Contacts[] array, String name) {
    int count = 0;
    int left = 0;
    int right = array.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (name.equals(array[mid].getRelation())) {
        System.out.println("Found Match Printing all Occurences");
        RelationLoop(array, name);
        count++;
        break;
      } else if (array[mid].getRelation().compareTo(name) < 0) {
        left = mid + 1;
      } else if (array[mid].getRelation().compareTo(name) > 0) {
        right = mid - 1;
      }
    }
    if (count == 0) {
      System.out.println("Not Found");
    }
  }

  public static void RelationLoop(Contacts[] arr, String value) {
    String sum = "";
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].getRelation().equals(value)) {
        sum += arr[i].getName() + " ";
      }
    }
    if (sum.length() > 0) {
      System.out.println(sum);
    } else {
      System.out.println("Not Found");
    }
  }

  public static void BinaryName(Contacts[] array, String name) {
    int count = 0;
    int left = 0;
    int right = array.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (name.equals(array[mid].getName())) {
        System.out.println("Found Match Printing all Occurences");
        NameLoop(array, name);
        count++;
        break;
      } else if (array[mid].getName().compareTo(name) < 0) {
        left = mid + 1;
      } else if (array[mid].getName().compareTo(name) > 0) {
        right = mid - 1;
      }
    }
    if (count == 0) {
      System.out.println("Not Found");
    }
  }

  public static void NameLoop(Contacts[] arr, String value) {
    String sum = "";
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].getName().equals(value)) {
        sum += arr[i].getName() + " ";
      }
    }
    if (sum.length() > 0) {
      System.out.println(sum);
    } else {
      System.out.println("Not Found");
    }
  }

  public static void RelationSort(Contacts[] array) {
    for (int i = 1; i < array.length; i++) {
      for (int j = 0; j < i; j++) {
        if (array[i].getRelation().compareTo(array[j].getRelation()) < 0) {
          String nameTemp = array[i].getName();
          String relationTemp = array[i].getRelation();
          String birthTemp = array[i].getBirthday();
          String numTemp = array[i].getNumber();
          String emailTemp = array[i].getEmail();

          array[i].setName(array[j].getName());
          array[i].setRelation(array[j].getRelation());
          array[i].setBirthday(array[j].getBirthday());
          array[i].setNumber(array[j].getNumber());
          array[i].setEmail(array[j].getEmail());

          array[j].setName(nameTemp);
          array[j].setRelation(relationTemp);
          array[j].setBirthday(birthTemp);
          array[j].setNumber(numTemp);
          array[j].setEmail(emailTemp);
        }
      }
    }
  }
}
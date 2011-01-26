package hello.java;

public class JavaBean {

  private String propertyA;
  private final String propertyB = "final value";
  private String propertyC;
  private boolean enabled;

  public JavaBean() {}

  public JavaBean(String propertyA, String propertyC, boolean enabled) {
    this.propertyA = propertyA;
    this.propertyC = propertyC;
    this.enabled = enabled;
  }

  public String getPropertyA() {
    return propertyA;
  }

  public void setPropertyA(String value) {
    propertyA = value;
  }

  public String getPropertyB() {
    return propertyB;
  }

  public boolean getEnabled() {
    return enabled;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(boolean value) {
    enabled = value;
  }

  public String getPropertyC() {
    return propertyC;
  }

  protected void setPropertyC(String value) {
    this.propertyC = value;
  }

  public static void main(String[] args) {

    JavaBean bean = new JavaBean();

    bean.setPropertyA("value set");
    System.out.println(bean.getPropertyA());

    bean.propertyA = "value assigned";
    System.out.println(bean.propertyA);

    //bean.setPropertyB("method does not exist");
    //bean.propertyB = "cannot assign";

    System.out.println(bean.getPropertyB());
    System.out.println(bean.propertyB);

    System.out.println(bean.isEnabled());

    bean.setEnabled(true);
    System.out.println(bean.getEnabled());

    System.out.println(bean.enabled);

    JavaBean anotherBean = new JavaBean("a", "c", true);

  }

}

package hello.groovy

class GroovyBean {

  String propertyA
  final String propertyB = 'final value'
  String propertyC
  boolean enabled

  protected void setPropertyC(String value) {
    this.propertyC = value
  }

  public static void main(args) {

    GroovyBean bean = new GroovyBean()

    bean.setPropertyA('value set')
    println bean.getPropertyA()

    bean.propertyA = 'value assigned'
    println bean.propertyA

    //bean.setPropertyB('method does not exist')
    //bean.propertyB = 'cannot assign'

    println bean.getPropertyB()
    println bean.propertyB

    println bean.isEnabled()

    bean.setEnabled(true)
    println bean.getEnabled()

    println bean.enabled

    GroovyBean anotherBean = new GroovyBean(propertyA:'a',
                                            propertyC: 'c',
                                            enabled: true)

    anotherBean.properties.each { name, value ->
      println "${name}:${value}"
    }

  }

}

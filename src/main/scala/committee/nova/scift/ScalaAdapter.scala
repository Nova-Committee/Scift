package committee.nova.scift

import org.dimdev.riftloader.listener.Instantiator

class ScalaAdapter extends Instantiator {
  override def newInstance[T](clazz: Class[T]): T = {
    val name = clazz.getName
    try {
      val objectClass = Class.forName(name + "$")
      val moduleField = objectClass.getField("MODULE$")
      val instance = moduleField.get(null).asInstanceOf[T]
      if (instance == null) throw new NullPointerException
      instance
    } catch {
      case _: Exception =>
        println(s"Unable to find ${name}$$MODULE$$")
        clazz.newInstance()
    }
  }
}

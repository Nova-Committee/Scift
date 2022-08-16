package committee.nova.scift

import org.apache.logging.log4j.{LogManager, Logger}
import org.dimdev.riftloader.listener.InitializationListener

class Scift extends InitializationListener {
  val LOGGER: Logger = LogManager.getLogger()

  override def onInitialization(): Unit = LOGGER.info("Scift activated!")
}


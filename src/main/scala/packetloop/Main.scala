package packetloop

import java.nio.channels.FileChannel
import java.nio.file.Paths

import scodec.bits.BitVector


object Main extends App {

  val ruleFileUri = getClass.getResource("/botcc.portgrouped.rules").toURI
  val fc = FileChannel.open(Paths.get(ruleFileUri))

  BitVector.fromMmap(fc)

  Console.println(s"Parsing the rule file: ${ruleFileUri.getPath}")

}

package fscoward.model

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.util.Date
import java.io.FileWriter
import java.io.IOException

class Sorting {
  
  def search = {
    
  }
  
  /*
   * ファイル移動 
   * move: Path, Path -> Unit
   */
  def move(from: Path, to: Path) = {

    try {
      Files.move(from, to, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING)
      writeToLog("write to: " + to.toString())
    } catch {
      case e: IOException => writeToLog("移動に失敗しました")
    }

  }

  /*
   * ログへ書き込み
   * writeToLog: String -> Unit
   */
  def writeToLog(_log: String): Unit = {
    // log.txt に書き出す
    val date = "%tY/%<tm/%<td %<tR" format new Date
    
    val log = date + ": " + _log + "\r\n"

    val filename = "log.txt"

    try {
      val writer = new FileWriter(filename, true)
      // ログへ書き込み
      writer.write(log)
      writer.close()
    } catch {
      case e: IOException => 
    }
  }

  /*
   * どこへ引き渡すかを決める
   * */

}
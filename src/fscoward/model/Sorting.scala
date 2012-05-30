package fscoward.model

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.util.Date

class Sorting {
  /*
   * ファイル移動 
   * move: Path, Path -> Unit
   */
  def move(from: Path, to: Path) = {
    Files.move(from, to, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING)
    val date = "%tY/%<tm/%<td %<tR" format new Date
    writeToLog(date + " : write to : " + to)
  }
  
  /*
   * ログへ書き込み
   * writeToLog: String -> Boolean
   */
  def writeToLog(log: String): Boolean = {
    // log.txt に書き出す
    val filename = "log.txt"
    
    true
  }
  
  /*
   * どこへ引き渡すかを決める
   * */

}
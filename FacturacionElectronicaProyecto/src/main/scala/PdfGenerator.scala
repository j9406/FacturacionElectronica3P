import java.io.{File, PrintWriter}


object PdfGenerator {
    
  def main(args: Array[String]): Unit = {
      val p = new PrintWriter(new File("/home/ozzie/Desktop/Factura.pdf"))

p.print("Hola,  Aqui guardo informacion que ingresaste desde la ")

p.print("\npagina web ")


p.close()
}
  
  
}
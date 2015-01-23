package de.tclass.project_euler

import de.tclass.project_euler.problems.ProblemTrait

object Main {

  def main(args: Array[String]) {

    val packageName = "de.tclass.project_euler.problems"

    for (i <- Range(1, 9)) {
      try {
        val problem = Class.forName(packageName + ".Problem" + i).newInstance.asInstanceOf[ProblemTrait]
          print("Problem "+i+": ")
         problem.solve()
      } catch {
        case e: Exception => println("Problem "+i+": Not implemented yet!");
      }
    }

  }

}
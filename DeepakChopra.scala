import scala.util.Random

val Starts     = List("Experiential truth ", "The physical world ", "Non-judgment ", "Quantum physics ")
val Middles    = List("nurtures ", "projects onto ", "imparts reality to ", "constructs with ")
val Qualifiers = List("abundance of ", "the barrier of ", "self-righteous ", "potential ")
val Finishes   = List("marvel.", "choices.", "creativity.", "actions.")

val Deepak     = Starts(Random.nextInt(Starts.size)) + Middles(Random.nextInt(Middles.size)) + Qualifiers(Random.nextInt(Qualifiers.size)) + Finishes(Random.nextInt(Finishes.size)) 
Deepak
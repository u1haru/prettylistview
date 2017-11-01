package koma.ui.demo

import javafx.application.Application
import javafx.collections.FXCollections
import javafx.scene.Scene
import javafx.stage.Stage
import koma.ui.PrettyListView


fun main(args: Array<String>) {
    Application.launch(KomaEmojiDemo::class.java, *args)
}

class KomaEmojiDemo : Application() {

    override fun start(primaryStage: Stage?) {
        val lv = PrettyListView<String>()
        lv.items = FXCollections.observableArrayList(('a'..'z').map {it.toString()})
        val scene = Scene(lv)
        primaryStage?.scene = scene
        primaryStage?.show()
    }
}


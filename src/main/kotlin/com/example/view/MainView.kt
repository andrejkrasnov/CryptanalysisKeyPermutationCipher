package com.example.view

import com.example.core.CryptanalysisKeyPermutationCipher
import com.example.core.DecodedString
import javafx.scene.control.TextField
import javafx.beans.binding.Bindings
import tornadofx.*



class MainView : View() {
    override val root = borderpane()
    private var decodedString = mutableListOf<DecodedString>().asObservable()
    private lateinit var encodedText: TextField

    private var decodeAllStringBtn = button("Все возможные варианты") { action {
        decodedString.clear()
        decodedString.addAll(CryptanalysisKeyPermutationCipher.cryptanalysisEncodedAllString(encodedText.text)) } }
    private var decodeStringBtn = button("Наиболее вероятные варианты") { action {
        decodedString.clear()
        decodedString.addAll(CryptanalysisKeyPermutationCipher.cryptanalysisEncodedString(encodedText.text)) } }

    init {
        with(root) {
            title = "Криптоанализ шифра простой перестановки с ключем"
            center = form {
            fieldset {
                hbox {
                    field("Введите строчку") {
                        hbox {
                            encodedText = textfield(){
                                minWidth = 300.0
                            }
                            decodeAllStringBtn.disableProperty().bind(Bindings.isEmpty(encodedText.textProperty()))
                            decodeStringBtn.disableProperty().bind(Bindings.isEmpty(encodedText.textProperty()))
                        }
                    }
                }

                hbox {
                    this += decodeAllStringBtn
                    vbox { minWidth = 10.0 }
                    this += decodeStringBtn
                }
                vbox { minHeight = 20.0 }
                tableview(decodedString) {
                    readonlyColumn("Перестановка", DecodedString::permutation).minWidth(150)
                    readonlyColumn("Разшифрованная строчка", DecodedString::decodedString).minWidth(250)
                }
            }
        }
            }

    }
}

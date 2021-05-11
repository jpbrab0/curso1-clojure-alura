(ns aprendendo_clojure.aula4)
;; Juntei o código das aulas em uma só essa seria a aula 5 do primeiro curso da formação.

(def estoque { :mochila 10 :camiseta 5 })
(println estoque)

(println (assoc estoque :cadeira 3))
(println (assoc estoque :mochila 2))
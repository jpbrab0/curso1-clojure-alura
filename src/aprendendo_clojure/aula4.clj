(ns aprendendo_clojure.aula4)
;; Juntei o código das aulas em uma só essa seria a aula 5 do primeiro curso da formação.

(def estoque { :mochila 10 :camiseta 5 })
(println estoque)

(println (assoc estoque :cadeira 3))
(println (assoc estoque :mochila 2))

(println (dissoc estoque :mochila 2))

(def pedido {
             :mochila { :quantidade 2, :preco 80}
             :camiseta { :quantidade 3, :preco 40 }})

(println "\n"pedido)

(def pedido
  (assoc pedido :chaveiro {:quantidade 1, :preco 10}))
(println pedido)
(println (pedido :mochila))                                 ; Mapa como função
(println (get pedido :mochila))
(println (:mochila pedido))

(println (:quantidade (:mochila pedido)))

(println (update-in pedido [:mochila :quantidade] inc))

; Threading
;; Em outras linguagens "pedido.get(mochila).get(quantidade)"
(-> pedido
    :mochila
    :quantidade
    println)


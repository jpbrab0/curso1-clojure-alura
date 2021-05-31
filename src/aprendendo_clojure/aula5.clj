(ns aprendendo_clojure.aula5)
;; Juntei o código das aulas em uma só essa seria a aula 6 do primeiro curso da formação.

(def pedido {:mochila  {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}
             :chaveiro {:quantidade 1, :preco 0}})

(defn preco-dos-produto [[_ valor]]
  (* (:quantidade valor) (:preco valor)))

;THREAD LAST
(defn total-do-pedido
  [pedido]
  (->> pedido
       ; ,,, = coleção
       (map preco-dos-produto ,,,)
       (reduce + ,,,)))

(println (map preco-dos-produto pedido))
(println (total-do-pedido pedido))

(defn gratuito?
  [[_ item]]
  (<= (get item :preco 0) 0))

(println (filter gratuito? pedido))
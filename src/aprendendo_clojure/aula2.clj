(ns aprendendo-clojure.aula2)
;; Juntei o código das aulas em uma só essa seria a aula 3 do primeiro curso da formação.
(def precos [30 70 1000])

(println (precos 0))
(println (get precos 0))
(println (get precos 2))
(println (get precos 17))
(println "Caso não tenha a posição 17 o valor padrão vai ser 0" (get precos 17 0))
(println "Caso tenha a posição 2 o valor padrão vai ser" (get precos 2 0))

;; Conj adiciona um dado ao final do vetor
(println (conj precos 5))
(println precos)

;; inc = Soma 1 em um valor
;; dec = Subtrai 1 em um valor
(println (update precos 0 inc))

(defn soma-1
  [valor]
  (println "Estou somando um em" valor)
  (+ valor 1))

(println (update precos 0 soma-1))
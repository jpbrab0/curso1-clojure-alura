(ns aprendendo_clojure.aula3)
;; Juntei o código das aulas em uma só essa seria a aula 5 do primeiro curso da formação.

;; Codigo da aula 3 e 4 juntas
(def precos [30, 700, 1000])

(defn aplica-desconto?
  "Verifica se o valor bruto é maior que 100 e retorna um booleano."
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  ;; Aplica é a função como parametro
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

;; Mapeando o vetor precos e retornando o valor descontado
(println (map valor-descontado precos))

;; Range cria valores de 0 a x
(println (range 10))
(println (filter even? (range 10)))

;; Retorna os valores maiores que 100
(println (filter aplica-desconto? precos))

;; Map após o filter
(println (map valor-descontado (filter aplica-desconto? precos)))
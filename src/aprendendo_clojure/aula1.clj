(ns aprendendo_clojure.aula1)
;; Juntei o código das aulas em uma só essa seria a aula 3 do primeiro curso da formação.
(defn mais-caro-que-100?
  "Verifica se o valor bruto é maior que 100 e retorna um booleano."
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  ;; Aplica é a função como parametro
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

;; Funções como parametros 'o'
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))

;; Funções anonimas de forma elegante 'o'
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 100))

;; Funções anonimas de forma feia >:(
(println (valor-descontado #(> %1 100) 1000))
(println (valor-descontado #(> %1 100) 100))
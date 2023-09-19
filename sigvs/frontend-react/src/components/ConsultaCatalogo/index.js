import { useEffect, useState } from 'react'
import ConverteBase64ToImage from './ConverteBase64ToImage'
import './style.css'

function ConsultaCatalogo() {
  const [produtos, setProdutos] = useState([])
  const [erro, setErro] = useState([])
  useEffect(() => {

    const consulta = async () => {
      try {
        const resposta = await fetch("http://localhost:8080/api/v1/produtos")
        const dados = await resposta.json()
        console.log(dados);
        setProdutos(dados)

      } catch (error) {
        setErro(error)
        console.error(erro)
      }
    }

    consulta()

  }, [])

  return (
    <div className='catalogo'>
      {

        produtos.map((item) => {
          return (
            <div className='container-catalogo'>
              <img width={200}
                src={ConverteBase64ToImage(item.imagem)}
                alt="Imagem"
              />
              <h4>{item.descricao}</h4>
              <span>Categoria: {item.categoria}</span>
              <span>Custo: {item.custo}</span>
              <span>Quantidade no estoque: {item.quantidadeNoEstoque}</span>
            </div>
          )
        })

      }
    </div>
  )
}

export default ConsultaCatalogo
const BotaoConclui = () => {
    const botaoConlui = document.createElement('button')

    botaoConlui.classList.add("check-button")
    botaoConlui.innerText = "Concluído"
    botaoConlui.addEventListener('click', concluirTarefa)

    return botaoConlui

}


const concluirTarefa = (evento) =>{

    const botaoConlui = evento.target

    const tarefaCompleta = botaoConlui.parentElement

    tarefaCompleta.classList.toggle("done")    
}

export default BotaoConclui
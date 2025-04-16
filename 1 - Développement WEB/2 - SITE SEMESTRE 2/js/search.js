window.onload = () => {
    errorH4 = document.getElementById("error-message")

    const search = window.location.search.slice(5)

    errorH4.textContent = search.length == 0 ? 
        "recherche vide" :
        "recherche ..."
    
    setTimeout(() => {
        if (search.length == search.length != 0) {
            errorH4.textContent = "pas de résultat trouvé pour : " + search.replaceAll("%20", " ");
        }
    }, 1000)
}
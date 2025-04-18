accentsTidy = function (s) {
    var r = s.toLowerCase();
    r = r.replace(new RegExp(/[àáâãäå]/g), "a")
    r = r.replace(new RegExp(/æ/g), "ae")
    r = r.replace(new RegExp(/ç/g), "c")
    r = r.replace(new RegExp(/[èéêë]/g), "e")
    r = r.replace(new RegExp(/[ìíîï]/g), "i")
    r = r.replace(new RegExp(/ñ/g), "n")
    r = r.replace(new RegExp(/[òóôõö]/g), "o")
    r = r.replace(new RegExp(/œ/g), "oe")
    r = r.replace(new RegExp(/[ùúûü]/g), "u")
    r = r.replace(new RegExp(/[ýÿ]/g), "y")
    return r;
};

function search(event) {

    const inputs = this.elements
    const textInput = inputs["text-search"]

    window.location.href = '/search.html?txt=' + accentsTidy(textInput.value)

    event.preventDefault()
    return false
}

window.onload = () => {
    const form = document.forms["search"]
    form.addEventListener("submit", search);
}
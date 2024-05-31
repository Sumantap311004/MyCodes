const nama = document.getElementById("masuk_nama");
const masuk_BID = document.getElementById("masuk_BID");
const masuk_email = document.getElementById("masuk_email");
const masuk_pass = document.getElementById("masuk_pass");

const errorelement1 = document.getElementById("error");
const errorelement2 = document.getElementById("error2");
const errorelement3 = document.getElementById("error3");
const errorelement4 = document.getElementById("error4");

// form.addEventListener('submit', (e) => {
//     let messages =[]
//     if(nama.value === '' || nama.value == null){
//         messages.push('Name is required');
//     }

//     if(messages.length > 0){
//         e.preventDefault()
//         errorelement1.innerText = messages.join(', ')
//     }
// })

const form = document.getElementById("form");
const course = document.getElementById("course");
const errorkon = document.getElementById("errorkon");
const lecture = document.getElementById("lecture");
const errorkont = document.getElementById("errorkont");
const text = document.getElementById("isi_subs");
const errork = document.getElementById("errork");

form.addEventListener('submit', (e) => {
    let messages =[]
    if(course.value == '' || course.value == null){
        messages.push('Course is required');
    }

    if(messages.length > 0){
        e.preventDefault()
        errorkon.innerText = messages.join(', ')
    }
})


form.addEventListener('submit', (e) => {
    let messages2 =[]
    if(lecture.value == '' || lecture.value == null){
        messages2.push('Lecture is required');
    }

    if(messages2.length > 0){
        e.preventDefault()
        errorkont.innerText = messages2.join(', ')
    }
})

form.addEventListener('submit',(e)=> {
    let messages3=[]
    if(text.value == '' || text.value == null){
        messages3.push('Course Subject is required');
    }

    if(messages3.length > 0){
        e.preventDefault()
        errork.innerText = messages3.join(', ');
    }
})
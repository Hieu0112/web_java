let CreateBtn = document.querySelector('.create-newpp');
let create = document.querySelector('.Create-newss');
let createOverlay = document.querySelector('.overlay-news');
CreateBtn.addEventListener('click', () => {
    create.classList.remove('hidden');
});

createOverlay.addEventListener('click', () => {
    create.classList.add('hidden');
});



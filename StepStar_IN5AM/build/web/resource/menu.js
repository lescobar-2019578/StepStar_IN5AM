/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const hamburguer = document.querySelector('.hamburguer');
const menu = document.querySelector('.menu-navegacion');

//console.log(menu)
//console.log(hamburguer)

hamburguer.addEventListener('click', ()=>{
    menu.classList.toggle("spread")
})

window.addEventListener('click', e=>{
    if(menu.classList.contains('spread') && e.target !=menu && e.target !=hamburguer){
        
        menu.classList.toggle("spread")
    }
})


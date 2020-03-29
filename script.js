var iterator = 0; //Проход по ссылкам внтури меню

function opacityBcg(menu) {
    return new Promise(
        (resolve, reject) => {
            let opacityBcg = 0;
            const int = setInterval(() => {
                menu.style.opacity = `${opacityBcg}`;
                opacityBcg += 0.3
                if (opacityBcg >= 1) clearInterval(int);
            }, 50);
        }
    )
}

function opacityBcgToZero(menu) {
    return new Promise(
        (resolve, reject) => {
            let opacityBcg = 1;
            const int = setInterval(() => {
                menu.style.opacity = `${opacityBcg}`;
                opacityBcg -= 0.5
                if (opacityBcg <= -1) clearInterval(int);
            }, 90);
        }
    )
}

function opacityMenuText(menu, links) {
    const int = setInterval(() => {
        links[iterator].style.opacity = '1';
        menu.style.opacity = `${opacityBcg}`;
        iterator++;
        if (iterator == 6) clearInterval(int);
    }, 50);
}

function opacityMenuTextToZero(menu, links) {
    const int = setInterval(() => {
        links[iterator - 1].style.opacity = '0';
        iterator--;
        if (iterator == 0) clearInterval(int);
    }, 50);
}

window.onload = () => {
    const myMenu = document.getElementById('mymenu');
    const content = document.getElementsByClassName('main-content');
    const theme = document.getElementById('theme');
    const task = document.getElementById('task');
    const electric = document.getElementById('electric');
    const members = document.getElementById('members');
    const roles = document.getElementById('roles');
    const process = document.getElementById('process');
    const projectLinks = document.getElementById('project_links');
    const menu = document.getElementById('menu');
    const links = document.getElementsByClassName('links');
    myMenu.onclick = () => {
        if (iterator == 0) {
            menu.style.display = 'flex';
            opacityBcg(menu).then(opacityMenuText(menu, links));
        } else {
            opacityBcgToZero(menu).then(opacityMenuTextToZero(menu, links));
            setTimeout(() => {
                menu.style.display = 'none';
            }, 500);
        }
    }
    theme.onclick = () => {
        let opacityContent = 0;
        electric.style.display = 'none';
        content[0].style.display = 'block';
        const int = setInterval(() => {
            content[0].style.opacity = `${opacityContent}`;
            opacityContent += 0.2;
            if (opacityContent >= 1) clearInterval(int);
        }, 100);
    }
    task.onclick = () => {
        let opacityContent = 0;
        electric.style.display = 'none';
        content[1].style.display = 'block';
        const int = setInterval(() => {
            content[1].style.opacity = `${opacityContent}`;
            opacityContent += 0.2;
            if (opacityContent >= 1) clearInterval(int);
        }, 100);
    }
    members.onclick = () => {
        let opacityContent = 0;
        electric.style.display = 'none';
        content[2].style.display = 'block';
        const int = setInterval(() => {
            content[2].style.opacity = `${opacityContent}`;
            opacityContent += 0.2;
            if (opacityContent >= 1) clearInterval(int);
        }, 100);
    }
    roles.onclick = () => {
        let opacityContent = 0;

        electric.style.display = 'none';
        content[3].style.display = 'block';
        const int = setInterval(() => {
            content[3].style.opacity = `${opacityContent}`;
            opacityContent += 0.2;
            if (opacityContent >= 1) clearInterval(int);
        }, 100);
    }
    process.onclick = () => {
        let opacityContent = 0;

        electric.style.display = 'none';
        content[4].style.display = 'block';
        const int = setInterval(() => {
            content[4].style.opacity = `${opacityContent}`;
            opacityContent += 0.2;
            if (opacityContent >= 1) clearInterval(int);
        }, 100);
    }
    projectLinks.onclick = () => {
        let opacityContent = 0;

        electric.style.display = 'none';
        content[5].style.display = 'block';
        const int = setInterval(() => {
            content[5].style.opacity = `${opacityContent}`;
            opacityContent += 0.2;
            if (opacityContent >= 1) clearInterval(int);
        }, 100);
    }
}
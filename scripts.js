function openProgram(programUrl) {
    var outputContainer = document.getElementById('output-container');
    
    // Clear existing content
    outputContainer.innerHTML = '';

    // Create a new iframe for the program
    var iframe = document.createElement('iframe');
    iframe.src = programUrl;
    iframe.classList.add('output-box');

    // Append the iframe to the output container
    outputContainer.appendChild(iframe);
}

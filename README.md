# Java Web Server Implementations

This project explores different models of web server implementations in Java:

- **Single-threaded Server:** Handles one client request at a time.
- **Multi-threaded Server:** Creates a new thread for each client request.
- **Thread Pool Server:** Utilizes a pool of threads to manage client requests efficiently.

## Features

- Basic HTTP request handling
- Support for concurrent client connections
- Demonstrates different threading models

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/AryanS-88/Java-Web-Server.git
   ```


2. **Navigate to the desired implementation:**
   ```bash
   cd Java-Web-Server/<Implementation_Directory>
   ```

   Replace `<Implementation_Directory>` with `Singlethreaded`, `MultiThreaded`, or `ThreadPool`.

3. **Compile and run the server:**
   ```bash
   javac Server.java
   java Server
   ```


## Usage

- After starting the server, open a web browser and navigate to `http://localhost:8080` to interact with the server.
- Modify the server code to experiment with request handling and responses.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your enhancements.

## License

This project is licensed under the MIT License. 

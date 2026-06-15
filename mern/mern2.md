# My App — React + Node/Express Full-Stack Starter

A simple full-stack application with a React frontend and a Node.js/Express backend.
This project shows how the frontend and backend communicate using APIs.

---

## 📁 Project Structure

```
my-app/
├── backend/
│   ├── package.json
│   ├── server.js
│   └── routes/
│       └── api.js
└── frontend/
    ├── package.json
    ├── public/
    └── src/
        ├── App.js
        └── index.js
```

---

## ⚙️ Setup Instructions

### 1. Create Project Folder

```bash
mkdir my-app
cd my-app
```

---

## 🔧 Backend Setup (Node.js + Express)

```bash
mkdir backend
cd backend
npm init -y
npm install express cors
```

### Create `server.js`

```js
const express = require('express');
const cors = require('cors');

const app = express();
app.use(cors());
app.use(express.json());

// Temporary storage (acts like a database)
let storedMessage = "Hello from the backend!";

// GET API
app.get('/api/message', (req, res) => {
  res.json({ message: storedMessage });
});

// POST API (send user input)
app.post('/api/message', (req, res) => {
  const { message } = req.body;
  storedMessage = message;
  res.json({ success: true });
});

const PORT = 5000;
app.listen(PORT, () => {
  console.log(`Server running on http://localhost:${PORT}`);
});
```

### Run Backend

```bash
node server.js
```

---

## 🎨 Frontend Setup (React)

From the root folder:

```bash
npx create-react-app frontend
cd frontend
```

### Update `src/App.js`

```jsx
import { useEffect, useState } from 'react';

function App() {
  const [message, setMessage] = useState('');
  const [input, setInput] = useState('');

  const getMessage = () => {
    fetch('http://localhost:5000/api/message')
      .then(res => res.json())
      .then(data => setMessage(data.message));
  };

  useEffect(() => {
    getMessage();
  }, []);

  const sendMessage = () => {
    fetch('http://localhost:5000/api/message', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ message: input })
    })
    .then(() => {
      setInput('');
      getMessage();
    });
  };

  return (
    <div>
      <h1>{message || 'Loading...'}</h1>

      <input
        value={input}
        onChange={(e) => setInput(e.target.value)}
        placeholder="Type message"
      />

      <button onClick={sendMessage}>
        Send
      </button>
    </div>
  );
}

export default App;
```

### Run Frontend

```bash
npm start
```

---

## ▶️ Running the App

Open two terminals:

### Terminal 1 (Backend)

```bash
cd backend
node server.js
```

Runs on: `http://localhost:5000`

---

### Terminal 2 (Frontend)

```bash
cd frontend
npm start
```

Runs on: `http://localhost:3000`

---

## 🔁 How It Works

1. The React app loads in the browser
2. It sends a GET request to the backend
3. The backend returns a message
4. The user types a new message
5. React sends a POST request
6. The backend updates the stored message
7. The UI refreshes with the new message

---

## 🚀 Features

* Simple REST API (GET and POST)
* React state management
* Live UI updates
* Basic backend data handling

---

## 🔮 Next Steps

* Store multiple messages (chat system)
* Add a database (MongoDB or PostgreSQL)
* Add authentication (JWT)
* Use environment variables (`dotenv`)
* Deploy to the cloud (Vercel + Render)

---

## ✅ Summary

* The backend handles data
* The frontend displays and sends data
* The API connects both parts

---

## 🧪 Example Output

```
Hello from the backend!
```

Users can update this message dynamically using the input field.

---

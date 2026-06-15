# My App — React + Node/Express Full-Stack Starter

A minimal full-stack project with a separate React frontend and Node.js/Express backend.

## Project Structure

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

## Setup

### 1. Create the project folder

```bash
mkdir my-app && cd my-app
```

### 2. Set up the backend

```bash
mkdir backend && cd backend
npm init -y
npm install express cors
```

Create `backend/server.js`:

```js
const express = require('express');
const cors = require('cors');

const app = express();
app.use(cors());
app.use(express.json());

app.get('/api/message', (req, res) => {
  res.json({ message: 'Hello from the backend!' });
});

const PORT = 5000;
app.listen(PORT, () => console.log(`Server running on port ${PORT}`));
```

Run the backend:

```bash
node server.js
```

### 3. Set up the frontend

From the `my-app` root:

```bash
npx create-react-app frontend
cd frontend
```

Edit `frontend/src/App.js`:

```jsx
import { useEffect, useState } from 'react';

function App() {
  const [message, setMessage] = useState('');

  useEffect(() => {
    fetch('http://localhost:5000/api/message')
      .then(res => res.json())
      .then(data => setMessage(data.message));
  }, []);

  return (
    <div>
      <h1>{message || 'Loading...'}</h1>
    </div>
  );
}

export default App;
```

Run the frontend:

```bash
npm start
```

### 4. Run both servers

Open two terminals:

- **Terminal 1** (backend): `cd backend && node server.js` → runs on `http://localhost:5000`
- **Terminal 2** (frontend): `cd frontend && npm start` → runs on `http://localhost:3000`

The React app fetches data from the Express API and displays "Hello from the backend!".

## Next Steps

- Add more endpoints in `backend/routes/api.js`
- Connect a database (MongoDB, PostgreSQL, etc.)
- Add environment variables with `dotenv` for configuration
- Add authentication (JWT, sessions, etc.)

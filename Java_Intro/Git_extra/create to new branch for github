Your screenshot shows how you created a new Git branch, added a file, committed the changes, and pushed the branch to GitHub in VS Code.

Let's understand each command in simple language.

## Git commands explained

### 1. Initialize Git repository

```
git init
```

- Initializes Git in your project.
- Starts tracking your project using Git.
- Creates a hidden `.git` folder.

### 2. Check available branches

```
git branch
```

Output:

```
* main
```

- `main` is your current branch.
- `*` indicates the currently selected branch.

### 3. Create and switch to a new branch

```
git checkout -b feature-1
```

- Creates a new branch named `feature-1`.
- Automatically switches from `main` to `feature-1`.

Your output:

```
Switched to a new branch 'feature-1'
```

### 4. Add files to staging

```
git add .
```

- Adds all new and modified files to the staging area.
- Prepares files for committing.

### 5. Commit changes

```
git commit -m "new feature"
```

- Saves your changes in Git history.
- `"new feature"` is the commit message.

Your output:

```
[feature-1 b5179bf] new feature
1 file changed, 1 insertion(+)
```

### 6. Push branch to GitHub

```
git push -u origin feature-1
```

- Uploads your branch to GitHub.
- `origin` means your remote GitHub repository.
- `feature-1` is the branch name.
- `-u` connects the local branch with its remote branch for future pushes.

Your screenshot confirms that the branch was pushed successfully.

### 7. Check branches again

```
git branch
```

Output:

```
* feature-1
  main
```

This means:

- `feature-1` is your current branch.
- `main` is your original branch.

## Git workflow visualization

main branch

Original project branch

git checkout -b feature-1

feature-1 branch

New feature development

git add .

git commit -m "new feature"

git push -u origin feature-1

GitHub Repository

feature-1 branch uploaded successfully

## Important Git commands for daily work

| Command                   | Purpose                        |
| ------------------------- | ------------------------------ |
| `git status`              | Check file changes             |
| `git branch`              | Show branches                  |
| `git checkout main`       | Switch to main                 |
| `git checkout -b test`    | Create new branch              |
| `git add .`               | Stage all changes              |
| `git commit -m "message"` | Save changes                   |
| `git push`                | Upload changes                 |
| `git pull`                | Download and integrate updates |
| `git merge feature-1`     | Merge a branch                 |
| `git log`                 | See commit history             |

## What should you do next?

After completing development in `feature-1`, you can merge it into `main`.

```
git checkout main
git pull origin main
git merge feature-1
git push origin main
```

Interview question: What is the difference between Git and GitHub?

- Git: A version control system used to track code changes.
- GitHub: An online platform used to host Git repositories and collaborate with developers.

Remember: Create branch → Write code → Add → Commit → Push → Merge.
